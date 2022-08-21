<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>STUDENT FORM</title>
</head>
<body>
<b>This is student registration form.jsp</b>
<br><br>

<!-- modelAttribute name (student) should match what we gave in controller method showForm()-->
<!-- when this page is loaded attribute's get methods are called..when submitted set methods are called -->
<form:form action="processForm" modelAttribute="student">

First Name : <form:input path="firstName"/>
<br><br>

Last Name : <form:input path="lastName"/>
<br><br>

<input type="submit" value="Submit">
</form:form>


</body>
</html>