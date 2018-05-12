<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<body>
<h2>Spring Rest Demo</h2>
<h3> ${contextRoot} syas Hi </h3>

<h3> ${pageContext.request.contextPath} syas Hi </h3>
<hr>
<a href="${contextRoot}/test/hello">Hello</a>

<br><br>

<a href="${contextRoot}/api/students">Get All Students</a>

</body>
</html>
