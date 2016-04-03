angular.module('app').controller("CreateProjectController", [
        "$scope", CreateProjectController]);
        

function CreateProjectController($scope) {
    $scope.model = {};
    $scope.serverError = "";
}