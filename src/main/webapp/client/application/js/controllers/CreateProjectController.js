(function(){
    "use strict";

    angular
        .module('app')
        .controller("CreateProjectController", 
            ["urls", "projectService", "appStates", "$state", CreateProjectController]);


    function CreateProjectController(urls, projectService, appStates, $state) {
        var vm = this;

        vm.urls = urls;
        vm.project = {};
        vm.serverError = '';
        vm.isSubmitting = false;
        vm.save = save;

        activate();

        function activate(){

        }

        function save(){
            vm.serverError = "";
            if(!isProjectFormValid()){
                return;
            }
            if (vm.isSubmitting) {
                return;
            }
            vm.isSubmitting = true;
            projectService.saveProject(vm.project)
                .then(onSaveSuccess)
                .catch(onSaveFailed)
                .finally(function(){
                    vm.isSubmitting = false;
                });
        }

        function isProjectFormValid(){
        if(vm.userForm.$invalid){
            angular.forEach(vm.userForm.$error.required, function(field){
                field.$setTouched();
            });
            return false;
        }
        return true;
    }

        function onSaveSuccess(response){
            $state.go(appStates.HOME);
        }

        function onSaveFailed(error){
            vm.serverError = error.statusText;
        }
    }
})();