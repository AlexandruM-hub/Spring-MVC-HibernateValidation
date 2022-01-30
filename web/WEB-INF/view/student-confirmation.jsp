<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student confirmation</title>
</head>
<body>
    The student is confirmed: ${student.firstName} ${student.lastName} ${student.country} ${student.favouriteLanguage}
    Operating systems:
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
        </c:forEach>
    </ul>
</body>
</html>