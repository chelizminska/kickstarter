angular.module('app.routeSelector').controller("RouteRequirementsController", [
        "$scope", RouteRequirementsController]);
        

function RouteRequirementsController($scope) {
    $scope.model = {};
    $scope.serverError = "";
}