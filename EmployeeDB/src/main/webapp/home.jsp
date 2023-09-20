<html>
<body>
<h2>Welcome to Springboot ${empDetails} </h2>
<h3>Insert Employee</h3>
<form action="addEmployee">
Name		:<input type="text" name="name"></input>
Employee ID: <input type"text" name="empId"></input>
<input type="submit">
</form>
<h2>Search Employee</h2>
<form action="searchEmployee">
Employee ID: <input type"text" name="empId"></input>
<input type="submit">
</form>

<h2>Delete Employee</h2>
<form action="deleteEmployee">
Employee ID: <input type"text" name="empId"></input>
<input type="submit">
</form>

<h3>Update Employee</h3>
<form action="updateEmployee">
Name		:<input type="text" name="name">
Employee ID: <input type"text" name="empId">
<input type="submit">
</form>
</body>
</html>


