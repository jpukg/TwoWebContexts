<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head></head>
<body>
<ul>
    <li><a href = "<c:url value = "/base"/>">BASE CONFIG</a></li>
    <li><a href = "<c:url value = "/add"/>">ADD CONFIG</a></li>
</ul>

<h2>Response from ${controllerClassName}</h2>
<h3>Root service info:</h3>
<span><b>Class</b>: ${rootServiceClass}</span><br/>
<span><b>Instance</b>: ${rootServiceClassInstanceNumber} of ${rootServiceClassCntInstance}</span><br/>
<span><b>Context</b>: ${rootServiceClassAppContext.getDisplayName()} </span><br/>
<b>Consumer list</b>:<br/>
<c:forEach items="${ConsumersOfRootServiceClassInstance}" var="item">
    ${item}<br>
</c:forEach>

<h3>Web service info:</h3>
<span><b>Class</b>: ${webServiceClass}</span><br/>
<span><b>Instance</b>: ${webServiceClassInstanceNumber} of ${webServiceClassCntInstance}</span><br/>
<span><b>Context</b>: ${webServiceClassAppContext.getDisplayName()} </span><br/>
<b>Consumer list</b>:<br/>
<c:forEach items="${ConsumersOfWebServiceClassInstance}" var="item">
    ${item}<br>
</c:forEach>

</body>
</html>