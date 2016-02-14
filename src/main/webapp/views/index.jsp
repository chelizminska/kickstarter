<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
  <jsp:include page="shared/componentsFiles.jsp"/>
</head>

  <body ng-app="app">
    <div>
      <div ui-view></div>
    </div>
  </body>

<jsp:include page="shared/appFiles.jsp"/>
</html>