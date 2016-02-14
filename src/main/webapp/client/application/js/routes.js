angular.module("app")
    .config([
        "$stateProvider", "$urlRouterProvider", "appSettings", "appStates",
        function($stateProvider, $urlRouterProvider, appSettings, appStates) {

            $urlRouterProvider.otherwise("/index");
  
            $stateProvider
                .state(appStates.PAGE_NOT_FOUND, {
                  url: "/page-not-found",
                  templateUrl: appSettings.pagesFolderPath + "404.html"
                })
                .state(appStates.FORBIDDEN, {
                  url: "/forbidden",
                  templateUrl: appSettings.pagesFolderPath + "403.html"
                })
                .state(appStates.UNAUTHORIZED, {
                  url: "/unautharized",
                  templateUrl: appSettings.pagesFolderPath + "401.html"
                })
                .state(appStates.HOME, {
                  url: "/index",
                  templateUrl: appSettings.pagesFolderPath + "main.html",
                  controller: "HomeController"
                })
                .state(appStates.LOGIN, {
                  url: "/login",
                  templateUrl: appSettings.pagesFolderPath + "login.html",
                  controller: "LoginController"
                })
                .state(appStates.REGISTER, {
                  url: "/register",
                  templateUrl: appSettings.pagesFolderPath + "register.html",
                  controller: "RegisterController"
                });
        }
    ]);