<%-- 
    Document   : MyFirstJSP
    Created on : 23.12.2015, 21:29:34
    Author     : Sasha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h2>My name is ${myName};</h2>
        <h2>My last name is ${myLastName}.</h2>
        <h2>Web application name located in the servlet container folder: ${applicationFolder}.</h2>
    </body>
</html>
