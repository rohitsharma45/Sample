<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib
      uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addDetails.obj">
<table>
<tr><td>SubjectId</td>
<td>
<select id="student_id" name="student_id">

<c:forEach items="${sessionScope.list}" var="list">
	<option value="${list}">${list}</option>
</c:forEach>
</select>
</td></tr>
<tr><td>Subjects</td>
<td>
	<input type="text" id="txtSubj" name="txtSubj" required  list="SubjList"/><br>
		<datalist id="SubjList">
		<option value="Subject1">Subject1</option>
		<option value="Subject2">Subject2</option>
		<option value="Subject3">Subject3</option>
		<option value="Subject4">Subject4</option>
		<option value="Subject5">Subject5</option>
	</datalist>
</td></tr>
<tr><td>Theory Marks</td> <td><input type="text" name="txtTheory" required></td></tr><br>
<tr><td>MCQ Marks</td> <td><input type="text" name="txtMcq" required></td></tr><br>
<tr><td>LAB Marks</td> <td><input type="text" name="txtLab" required></td></tr><br>
<tr><td><input type="submit" value="Submit"></td></tr>
</table>
</form>
</body>
</html>