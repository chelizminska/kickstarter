angular.module("app.customForms", ["app.constants"])

.directive("inputWrapper", ["appSettings", function(appSettings) {
    return {
        transclude: true,
        templateUrl: appSettings.templatesFolderPath + "input-wrapper.html",
        scope: {
            label: "@",
            inputReference: "="
        }
    };
}]);