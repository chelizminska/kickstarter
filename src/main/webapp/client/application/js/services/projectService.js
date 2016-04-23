(function () {
    "use strict";

    angular.module('app').factory('projectService', ['urls', '$http', '$q', projectService]);

    function projectService(urls, $http, $q) {
        return {
            saveProject: saveProject,
            getProject: getProject,
            getUserProjects: getUserProjects,
            getAll: getAll
        }

        function saveProject(project){
            var deferred = $q.defer();

            $http.post(urls.PROJECT_SAVE, project).then(function(response){
                if (response.data.success) {
                    deferred.resolve(response.data.data);
                }else{
                    deferred.reject({statusText: response.data.errorMessage});
                }
            }, function(error){
                deferred.reject(error);
            });

            return deferred.promise;
        }

        function getProject(projectId){
            var deferred = $q.defer();

            $http({
                url: urls.PROJECT_GET,
                method: "GET",
                params: {projectId: projectId}
            })
            .then(function(response){
                if (response.data.success) {
                    deferred.resolve(response.data.data);
                }else{
                    deferred.reject({statusText: response.data.errorMessage});
                }
            }, function(error){
                deferred.reject(error);
            });

            return deferred.promise;
        }

        function getUserProjects(){
            var deferred = $q.defer();

            $http.get(urls.USER_PROJECTS)
                .then(function(response){
                    if (response.data.success) {
                        deferred.resolve(response.data.data);
                    }else{
                        deferred.reject({statusText: response.data.errorMessage});
                    }
                }, function(error){
                    deferred.reject(error);
                });

            return deferred.promise;
        }

        function getAll(){
            var deferred = $q.defer();

            $http.get(urls.PROJECTS_GET_ALL)
                .then(function(response){
                    if (response.data.success) {
                        deferred.resolve(response.data.data);
                    }else{
                        deferred.reject({statusText: response.data.errorMessage});
                    }
                }, function(error){
                    deferred.reject(error);
                });

            return deferred.promise;
        }
    }
})();