<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="home" method="post">
    <h3>Number One:</h3>
    <input type="number" name="numberOne" value="0" placeholder="0">
    <h3>Number Two:</h3>
    <input type="number" name="numberTwo" value="0" placeholder="0">
    <input type="submit" name="add" value="+">
    <input type="submit" name="sub" value="-">
    <input type="submit" name="mul" value="*">
    <input type="submit" name="div" value="/">
</form>
<c:if test="${not empty result}">
    <h1>Result</h1>
    <p>${result}</p>
</c:if>
</body>
</html>