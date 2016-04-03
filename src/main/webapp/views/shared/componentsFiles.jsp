<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

    <spring:url value="/client/components/angular/angular.js" var="angularJs" />
    <script src="${angularJs}"></script>

    <spring:url value="/client/components/jquery/dist/jquery.js" var="jqueryJs" />
    <script src="${jqueryJs}"></script>

    <spring:url value="/client/components/bootstrap/dist/js/bootstrap.js" var="bootstrapJs" />
    <script src="${bootstrapJs}"></script>

    <spring:url value="/client/components/angular-bootstrap/ui-bootstrap-tpls.js" var="angularBootstrapJs" />
    <script src="${angularBootstrapJs}"></script>

    <spring:url value="/client/components/angular-route/angular-route.js" var="angularRouteJs" />
    <script src="${angularRouteJs}"></script>

    <spring:url value="/client/components/angular-ui-router/release/angular-ui-router.js" var="angularUiRouterJs" />
    <script src="${angularUiRouterJs}"></script>

    <spring:url value="/client/components/angular-messages/angular-messages.js" var="angularMessagesJs" />
    <script src="${angularMessagesJs}"></script>

    <spring:url value="/client/components/angular-sanitize/angular-sanitize.js" var="angularSanitizeJs" />
    <script src="${angularSanitizeJs}"></script>