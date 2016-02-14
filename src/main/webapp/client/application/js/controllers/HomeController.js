angular.module('app').controller("HomeController", [
        "$scope", HomeController]);
        

function HomeController($scope) {
    $scope.model = {};
    $scope.serverError = "";
}