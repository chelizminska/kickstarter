angular.module('app').controller("RegisterController", [
        "$scope", "authService", "appStates", "$state", RegisterController]);

function RegisterController($scope, authService, appStates, $state) {
    $scope.user = {};
    $scope.isSubmitting = false;
    $scope.serverError = "";

    $scope.register = function(user) {
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
        authService.register(user).then(
            function(response){
                $state.go(appStates.HOME);
            }, 
            function(data) {
                $scope.serverError = data.statusText;
                $scope.isSubmitting = false;
            }
        );
    }
}