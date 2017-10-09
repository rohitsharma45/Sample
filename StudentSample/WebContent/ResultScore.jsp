<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.ArrayList, com.cg.bean.StudentBean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String studentId = session.getAttribute("studentId").toString();
String subjectName = session.getAttribute("subjName").toString();
int total = Integer.parseInt(session.getAttribute("totalmarks").toString());
String grade = session.getAttribute("grade").toString();
%>
<%=studentId %>
<%=subjName %>
<%=totalmarks %>
<%=grade %>
</body>
</html>