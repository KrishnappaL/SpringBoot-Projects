<html>
<head>
<title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<h3>Hi ${username}</h3>
<form action="addStudent">	<!--container to insert-->
Name:<input type="text" name="studentName"> <br>
Roll No:<input type="text" name="rollNo" ><br>
<input type="submit" >
</form>
<h1>DELETE</h1>
<form action="deleteStudent"> <!--container to delete-->
Roll No:<input type="text" name="rollNo" ><br>
<input type="submit" >
</form>

<form action="updateStudent">	<!--container to update-->
<h1>UPDATE</h1>
Name:<input type="text" name="studentName"> <br>
Roll No:<input type="text" name="rollNo" ><br>
<input type="submit" >
</form>

<form action="viewStudent">	<!--container to update-->
<h1>VIEW</h1>
Roll No:<input type="text" name="rollNo" ><br>
<input type="submit" >
</form>
<strong>Current time is</strong>: <%=new Date() %>
</body>
</html>