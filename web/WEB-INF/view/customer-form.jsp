<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
    <title>Customer Registration form</title>
    <style>
        .error{color:red}
    </style>
</head>

<body>
<form:form action="processForm" modelAttribute="customer">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name (*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>
    Enter a number: <form:input path="someNumber"/>
    <form:errors path="someNumber" cssClass="error"/>
    <br><br>
    Enter postal code: <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>
    <br><br>
    Enter something starting with HEY : <form:input path="myAnnotTest"/>
    <form:errors path="myAnnotTest" cssClass="error"/>
    <br><br>
    <input type="submit" value="Submit"/>
</form:form>
</body>

</html>