
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AJAX calls using Jquery in Servlet</title>
	<link href="resources/css/ui-lightness/jquery-ui-1.10.3.custom.css" rel="stylesheet">
	<script src="resources/js/jquery-1.9.1.js"></script>
	<script src="resources/js/jquery-ui-1.10.3.custom.js"></script>
        <script>
            $(document).ready(function() {                        
                $('#submit').click(function(event) {  
                    var username=$('#user').val();
                 $.get('AJAXTest_1',{user:username},function(responseText) { 
                        $('#welcometext').text(responseText);         
                    });
                });
            });
        </script>
        <script type="text/javascript">
        $('#call').click(function(event){$.get('AJAXTest_1');});
        </script>
</head>
<body>
<form id="form1">
<h1>AJAX Demo using Jquery in JSP and Servlet</h1>
Enter your Name:
<input type="text" id="user"/>
<input type="button" id="submit" value="Ajax Submit"/>
<input type="button" id="call" value="call">
<br/>
<div id="welcometext">
</div>
</form>
</body>
</html>
