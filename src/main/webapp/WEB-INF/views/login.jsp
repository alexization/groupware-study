<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .login-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        .login-container h2 {
            margin-bottom: 20px;
            text-align: center;
        }
        .login-container label {
            display: block;
            margin-bottom: 5px;
        }
        .login-container input[type="text"],
        .login-container input[type="password"] {
            width: calc(100% - 16px);
            padding: 8px;
            margin-bottom: 10px;
            border-radius: 4px;
            border: 1px solid #ccc;
        }
        .login-container .toggle-container {
            display: flex;
            justify-content: space-between;
            margin-bottom: 20px;
        }
        .login-container .toggle-container label {
            flex: 1;
            text-align: center;
            cursor: pointer;
        }
        .login-container .toggle-container input[type="radio"] {
            display: none;
        }
        .login-container .toggle-container input[type="radio"] + label {
            padding: 10px;
            background-color: #ddd;
            border-radius: 4px;
        }
        .login-container .toggle-container input[type="radio"]:checked + label {
            background-color: #007BFF;
            color: white;
        }
        .login-container input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .login-container input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="login-container">
    <h2>Login</h2>
    <form action="loginProcess.jsp" method="post">
        <div class="toggle-container">
            <input type="radio" id="member" name="login_type" value="true" checked>
            <label for="member">Member</label>

            <input type="radio" id="admin" name="login_type" value="false">
            <label for="admin">Admin</label>
        </div>
        <label for="id">User ID:</label>
        <input type="text" id="id" name="id" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>
