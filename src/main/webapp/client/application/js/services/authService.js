angular.module('app').factory("authService",
    ["$http", "$q", "$window", "appEvents", "$rootScope", authService]);

function authService($http, $q, $window, appEvents, $rootScope) {
    var userInfo = null;

    function init() {
        if ($window.sessionStorage["userInfo"]) {
            userInfo = JSON.parse($window.sessionStorage["userInfo"]);
            if(userInfo){
                $rootScope.$emit(appEvents.USER_INFO_CHANGED, userInfo);
            }
        }
    }

    init();

    function UpdateUserInfo(data){
        userInfo = data;
        $window.sessionStorage["userInfo"] = JSON.stringify(userInfo);
        $rootScope.$emit(appEvents.USER_INFO_CHANGED, userInfo);
    }

    return {
        register: function(registerModel) {
            var deferred = $q.defer();

            $http.post("/account/register", registerModel).then(function(response){
                if (response.data.success) {
                    UpdateUserInfo(response.data.data);
                    deferred.resolve(userInfo);
                }else{
                    deferred.reject({statusText: response.data.errorMessage});
                }
            }, function(error){
                deferred.reject(error);
            });

            return deferred.promise;
        },
        login: function(loginModel) {
            var deferred = $q.defer();

            $http.post("/account/login", loginModel).then(function(response){
                if (response.data.success) {
                    UpdateUserInfo(response.data.data);
                    deferred.resolve(response.data.data);
                }else{
                    deferred.reject({statusText: response.data.errorMessage});
                }
            }, function(error){
                deferred.reject(error);
            });

            return deferred.promise;
        },
        getUserInfo: function() {
            return userInfo;
        },
        logoff: function () {
            var deferred = $q.defer();

            $http.post("/account/logoff").then(function(result) {
                $window.sessionStorage["userInfo"] = null;
                userInfo = null;
                deferred.resolve(result);
            }, function(error) {
                deferred.reject(error);
            });

            return deferred.promise;
        },
        isAuthenticated: function(){
            return userInfo !== null && userInfo !== undefined;
        }
    };
}