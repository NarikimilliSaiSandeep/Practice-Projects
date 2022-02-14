<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta charset="UTF-8">
<title>JSP Directives</title>
</head>
<body>

This is content from the main file.

<hr>
Example of using JSTLtaglibs for formatting output<br>
<p>
        Currency = <fmt:formatNumbervalue = "145" type = "currency"/>
<p>
<p>
        <c:set var = "now" value = "<%= new java.util.Date()%>" />
        Current date and time is <fmt:formatDate pattern = "yyyy-MM-dd hh:mm:ss" value = "${now}" />
</p>

</body>
</html>
