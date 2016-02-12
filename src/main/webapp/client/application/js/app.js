(function() {

    angular.module("app", [
        "app.customForms",
        "app.routeSelector",
        "vendor"
    ]);

    angular.module("vendor", [
        "ui.router",
        "ui.bootstrap",
        "ngRoute",
        "ngMessages",
        "ngSanitize"
    ]);

    angular.module("app.constants", []);
    angular.module("app.customForms", ["vendor", "app.constants"]);
    angular.module("app.routeSelector", ["vendor", "app.constants"]);
})();
