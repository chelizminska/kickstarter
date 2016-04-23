angular.module('app').controller("LoginController", [
        "$scope", "authService", "appStates", "$state", "router", LoginController]); 


function LoginController($scope, authService, appStates, $state, router) {
    $scope.user = {};
    $scope.isSubmitting = false;
    $scope.serverError = "";

    $scope.login = function(user) {
        $scope.serverError = "";
        if($scope.userForm.$invalid){
            angular.forEach($scope.userForm.$error.required, function(field){
                field.$setTouched();
            });
            return;
        }

        if ($scope.isSubmitting) {
            return;
        }

        $scope.isSubmitting = true;
        authService.login(user).then(
            function(response){
                if(router.hasRedirect()){
                    router.redirect();
                }else{
                    $state.go(appStates.USER_PROJECT_LIST);
                }
            },
            function(data) {
                $scope.serverError = data.statusText;
                $scope.isSubmitting = false;
            }
        );
    }
}