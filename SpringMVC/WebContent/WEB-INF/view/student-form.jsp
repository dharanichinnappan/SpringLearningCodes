<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>STUDENT FORM</title>
</head>
<body>
	<b>This is student registration form.jsp</b>
	<br>
	<br>

	<!-- modelAttribute name (student) should match what we gave in controller method showForm()-->
	<!-- when this page is loaded attribute's get methods are called..when submitted set methods are called -->
	<form:form action="processForm" modelAttribute="student">

First Name : <form:input path="firstName" />
		<br>
		<br>

Last Name : <form:input path="lastName" />
		<br>
		<br>

		<!-- Country options are coded in jsp file -->
Country:
<form:select path="country">
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="France" label="France"></form:option>
			<form:option value="Germany" label="Germany"></form:option>
			<form:option value="India" label="India"></form:option>
		</form:select>
		<br>
		<br>


Language:
<form:select path="language">
			<form:option value="${null}" label="Select" />
			<form:options items="${student.languageOptions}" />
		</form:select>
		<br>
		<br>
		
		
Technical Language:
<br>
		<form:radiobutton path="techLanguage" value="Java" />Java<br>
		<form:radiobutton path="techLanguage" value="C++" />C++<br>
		<form:radiobutton path="techLanguage" value="PHP" />PHP<br>
		<form:radiobutton path="techLanguage" value="Ruby" />Ruby<br>
		<br>
		<br>	

Operating System:

<br>
		<form:checkbox path="operatingSystem" value="linux" />Linux	<br>
		<form:checkbox path="operatingSystem" value="windows" />Windows	<br>
		<form:checkbox path="operatingSystem" value="Mac Os" />Mac Os
		<br>
		<br>
		
Companies:

<br>

		<form:checkbox path="companies" value="infy" />Infosys	<br>
		<form:checkbox path="companies" value="CTS" />Cognizant	<br>
		<form:checkbox path="companies" value="TCS" />Tata
		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>


</body>
</html>