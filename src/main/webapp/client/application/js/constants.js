(function (window) {

    APP_USER = {
        ROLES: {
            ADMINISTRATOR: "Administrator",
            USER: "User"
        }
    }

    var EVENTS = {
        USER_INFO_CHANGED: "tp.userInfoChanged"        
    }

    STATES = {
        HOME: "home",
        REGISTER: "register",
        LOGIN: "login",
        PAGE_NOT_FOUND: "404",
        FORBIDDEN: "403",
        UNAUTHORIZED: "401"
    }

    var serverPath = window.location.protocol + '//' + window.location.host + '/';

    angular.module("app.constants", [])
        .constant("tripSegments", TRIP_SEGMENTS)
        .constant("appStates", STATES)
        .constant("appUser", APP_USER)
        .constant("appEvents", EVENTS)
        .constant("appSettings", {
            serverPath: serverPath,
            templatesFolderPath: "client/application/html/templates/",
            pagesFolderPath: "client/application/html/pages/"
    });

})(window);

