<%--
  Created by IntelliJ IDEA.
  User: Sam
  Date: 3/4/2025
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
<header>
    <h1>Login</h1>
</header>

<main>
    <form action="login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>

        <button type="submit">Login</button>
    </form>

    <%-- Error message display --%>
    <c:if test="${not empty param.error}">
        <div class="error">Invalid login credentials. Please try again.</div>
    </c:if>

    <p>Don't have an account? <a href="register.jsp">Register here</a></p>
</main>

<footer>
    <p>&copy; 2025 E-Commerce Platform</p>
</footer>

<script src="js/script.js"></script>
</body>
</html>

