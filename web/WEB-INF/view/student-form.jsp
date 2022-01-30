<%@ taglib prefix ="form" uri ="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName"/>
        <br><br>
        Last name: <form:input path="lastName"/>
        <br><br>
        Country:
        <form:select path="country">
            <form:options items="${student.countryOptions}"/>
        </form:select>
        <br><br>
        Favourite Languages
        <!-- populam in html form -->
        <!-- Java <form:radiobutton path="favouriteLanguage" value="Java"/>
        Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/>
        C++ <form:radiobutton path="favouriteLanguage" value="C++"/>
        Python <form:radiobutton path="favouriteLanguage" value="Python"/> -->
        <!-- populam din java class -->
        <form:radiobuttons path="favouriteLanguage" items="${student.favouriteLanguage2}"/>
        <br><br>
        Linux<form:checkbox path="operatingSystems" value="Linux"/>
        Windows <form:checkbox path="operatingSystems" value="Windows"/>
        Mac <form:checkbox path="operatingSystems" value="Max"/>
        <br><br>
        <input type="submit" value="Submit"/>
    </form:form>

</body>
</html>