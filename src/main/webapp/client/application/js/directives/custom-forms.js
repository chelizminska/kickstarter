angular.module("app").directive("inputWrapper", ["appSettings", function(appSettings) {
    return {
        transclude: true,
        templateUrl: appSettings.templatesFolderPath + "input-wrapper.html",
        scope: {
            label: "@",
            inputReference: "="
        }
    };
}]);