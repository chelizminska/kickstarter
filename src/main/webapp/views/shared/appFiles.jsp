<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

    <spring:url value="/client/application/js/app.js" var="appJs" />
    <script src="${appJs}"></script>

    <spring:url value="/client/application/js/constants.js" var="appConstantsJs" />
    <script src="${appConstantsJs}"></script>

    <spring:url value="/client/application/js/routes.js" var="appRouterJs" />
    <script src="${appRouterJs}"></script>

    <spring:url value="/client/application/js/config/global.js" var="appGlobalJs" />
    <script src="${appGlobalJs}"></script>

    <spring:url value="/client/application/js/controllers/HomeController.js" var="appHomeControllerJs" />
    <script src="${appHomeControllerJs}"></script>

    <spring:url value="/client/application/js/controllers/LoginController.js" var="appLoginControllerJs" />
    <script src="${appLoginControllerJs}"></script>

    <spring:url value="/client/application/js/controllers/RegisterController.js" var="appRegisterControllerJs" />
    <script src="${appRegisterControllerJs}"></script>

    <spring:url value="/client/application/js/directives/custom-forms.js" var="appCustomFormsDirectiveJs" />
    <script src="${appCustomFormsDirectiveJs}"></script>

    <spring:url value="/client/application/js/directives/restrict.js" var="appRestrictDirectiveJs" />
    <script src="${appRestrictDirectiveJs}"></script>

    <spring:url value="/client/application/js/filters/truncate.js" var="appTruncateFilterJs" />
    <script src="${appTruncateFilterJs}"></script>

    <spring:url value="/client/application/js/services/authService.js" var="appAuthServiceJs" />
    <script src="${appAuthServiceJs}"></script>

    <spring:url value="/client/application/js/services/imageConverter.js" var="appImageConverterServiceJs" />
    <script src="${appImageConverterServiceJs}"></script>

    <spring:url value="/client/application/js/services/permissionService.js" var="appPermissionServiceJs" />
    <script src="${appPermissionServiceJs}"></script>

    <spring:url value="/client/application/js/services/router.js" var="appRouterServiceJs" />
    <script src="${appRouterServiceJs}"></script>
