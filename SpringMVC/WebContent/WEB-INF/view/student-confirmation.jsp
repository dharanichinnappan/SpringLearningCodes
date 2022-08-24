<!-- this is for check box -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>STUDENT CONFIRMATION</title>
</head>
<body>
<b>This is student confirmation.jsp</b>
<br><br>

The Student is confirmed : ${student.firstName} ${student.lastName}

<br><br>

The selected country is : ${student.country}

<br><br>

The selected language is : ${student.language}

<br><br>

Favourite tech language is : ${student.techLanguage }

<br><br>

Chosen Operaring System is : ${student.operatingSystem }

<br><br>
Companies previously worked with :
<ul>
			<c:forEach var="temp" items="${student.companies}">
			<li> ${temp} </li>
			</c:forEach>
			
		</ul>
</body>
</html>