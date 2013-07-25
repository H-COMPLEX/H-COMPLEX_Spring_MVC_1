<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home_1</title>


	<link href="resources/css/ui-lightness/jquery-ui-1.10.3.custom.css" rel="stylesheet">
	<script src="resources/js/jquery-1.9.1.js"></script>
	<script src="resources/js/jquery-ui-1.10.3.custom.js"></script>
	<script>
	$(function(){$( "#date" ).datepicker();})
		 
	</script>
</head>
<body>
<h1>
	Hello Manoranjan !  
</h1>

<P>  The time on the server is ${serverTime}. AND ${test_field} </P>

<input type="text" name="date" id="date" /> 

</body>
</html>
	