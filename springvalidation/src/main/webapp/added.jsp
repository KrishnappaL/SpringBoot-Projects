<html>
<head>
<title>First JSP</title>
</head>
<body>
<%@ page import=" java.util.regex.Matcher"%>
<%@ page import=" java.util.regex.Pattern"%>
<body>

<% out.println("mobile number:"); %>
<%
String mobile="07784389833";
		Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m=p.matcher(mobile);
		if(m.find())
			out.println(mobile + " is a valid no.");
		else
			out.println(mobile +" is not a valid no");
%>
<h3>Hi ${studentDetails.studentName}</h3>  <br>

</body>
</html>



<!--lakshmi.jsp take request and response provided by added.jsp-->