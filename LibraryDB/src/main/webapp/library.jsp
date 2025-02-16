<html>
<head>
<link rel="stylesheet" type="text/css" href="home.css">
 <link rel="icon" type="image/x-icon" href="favicon.ico">

<title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<body style="background:yellow">
<h3 style="color:brown; text-decoration:underline">Hi Lakshmi ,Welcome</h3>
<div class=table>
<form action="insertlib">	<!--container to insert-->
<div class="input">
Book No:	<input text="text" name="bookNo"><br>
Book Name:  <input type="text" name="bookTitle"> <br>
Author name:<input type="text" name="authorName" ><br>
<input type="submit" >
</form>
</div>
<h1>DELETE</h1>
<div class="input">

<form action="deletelib"> <!--container to delete-->
Book No:   <input text="text" name="bookNo"><br>
<input type="submit" >
</form>
</div>
<form action="updatelib">	<!--container to update-->
<h1>UPDATE</h1>
<div class="input">

Book No:	<input text="text" name="bookNo"><br>
Book Name:  <input type="text" name="bookTitle"> <br>
<input type="submit" >
</form>
</div>
<form action="viewlib">	
<h1>VIEW</h1>
<div class="input">
Book No:	<input text="text" name="bookNo"><br>
<input type="submit" >
</form>
</div>
<strong>Current time is</strong>: <%=new Date() %>
</div>
</body>
</html>