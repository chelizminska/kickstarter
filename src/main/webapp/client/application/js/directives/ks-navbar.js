angular.module("app").directive("ksNavbar", ["appSettings", ksNavbar]);
    
function ksNavbar(appSettings) {
    return {
        restrict: "E",
        templateUrl: appSettings.templatesFolderPath + "ks-navbar.html",
        controller: ["appStates", "$state", "authService", "appUser", NavBarCtrl],
        controllerAs: "vm"
    };
}

function NavBarCtrl(appStates, $state, authService, appUser){
	var vm = this;
	vm.goToHome = goToHome;
    vm.goToLogin = goToLogin;
    vm.goToRegister = goToRegister;
    vm.isAuthorized = isAuthorized;
    vm.signOut = signOut;
    vm.user = null;
    vm.appRoles = appUser.ROLES;

	function goToHome(){
		$state.go(appStates.HOME);
	}

    function goToLogin(){
        $state.go(appStates.LOGIN);
    }

    function goToRegister(){
        $state.go(appStates.REGISTER);
    }

    function signOut(){
        authService.logoff();
        goToHome();
    }

    function isAuthorized(){
        vm.user = authService.getUserInfo();
        return vm.user;
    }
}

