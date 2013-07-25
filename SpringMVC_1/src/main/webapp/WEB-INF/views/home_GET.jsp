<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<link href="resources/css/ui-lightness/jquery-ui-1.10.3.custom.css" rel="stylesheet">
	<script src="resources/js/jquery-1.9.1.js"></script>
	<script src="resources/js/jquery-ui-1.10.3.custom.js"></script>

	<!--<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />  -->
	<!-- link rel="stylesheet" href="/resources/demos/style.css" /-->
	<!-- <script src="http://code.jquery.com/jquery-1.9.1.js"></script> -->	
	<!--<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>  --> 
	  
	<script type="text/javascript">
		$(
				function()
				{console.log("date function called");
					$( "#date" ).datepicker();}
			)
		
	</script>
	  <script type="text/javascript">  
	  //$(function() {    $( "#dialog" ).dialog();  }); 
	  
      $(document).ready(
    		  function() {                        
       $('#submit').click(function(event)
      {var num1=$('#number1').val();
	  var num2=$('#number2').val();
	  console.log(num1);
	  console.log(num2);
	  $(function(){$('#dialog').text("after click event");});
	  
	 $.get('AJAXTest_1',{number_1:num1, number_2:num2}, function(responseText) { 
		 console.log(responseText);
		 $('#result3').value=responseText;});
	  }
       );}
    		  );          		
	  
	  </script>
	  
	  <script type="text/javascript">
	  $.ajax({
		  type: 'POST',
		  url: 'AJAXTest_1',
		  data: { postVar1: 'theValue1', postVar2: 'theValue2' },
		  beforeSend:function(){
		    // this is where we append a loading image
		    $('#ajax-panel').html('<div class="loading"><img src="/images/loading.gif" alt="Loading..." /></div>');
		  },
		  success:function(data){
		    // successful request; do something with the data
		    $('#ajax-panel').empty();
	    $(data).find('item').each(function(i){
	      $('#ajax-panel').append('<h4>' + $(this).find('title').text() + '</h4><p>' + $(this).find('link').text() + '</p>');
	    });
/* 			$('#ajax-panel').html(data); */

		  },
		  error:function(){
		    // failed request; give feedback to user
		    $('#ajax-panel').html('<p class="error"><strong>Oops!</strong> Try that again in a few moments.</p>');
		  }
		});
	  </script>
	  <script type="text/javascript">
	  function init()
	  {
	    if(navigator.geolocation)
	    {
	      document.getElementById("support").innerHTML = "<p style='color:green'>Great! This browser supports HTML5 Geolocation</p>";
	    }
	    else
	    {
	      document.getElementById("support").innerHTML = "<p style='color:red'>Oops! This browser does not support HTML5 Geolocation</p>";
	    }
	  }
	  </script>

</head>
<body>
<h1>
	Hello Manoranjan Das!  
</h1>

<P>  The time on the server is ${serverTime}. AND ${test_field} </P>



 
<!-- form method='POST' enctype='multipart/form-data' action='http://localhost:8080/SpringMVC_1/home'>
File to upload: <input type=file name=upfile><br>
<br>
	<input type=text id="date">
	<input type=text id="number1">
	<input type=text id="number2">
	<input type=text id="result3">
	<input type=submit value=Press>
	<div id="dialog">test</div>

</form-->

<input type=text id="date">
	<input type=text id="number1">
	<input type=text id="number2">
	<input type=text value="temp" id="result3">
	<input type=submit id="submit" value="Press here">
	<input type=button value="Press also" onclick="init()">
	<div id="dialog">test</div>
	<div id="dialog1">test1</div>
	<div id="ajax-panel">new test</div>
	<div id="support"></div>
	
	<!-- Codes by HTML.am -->
<marquee behavior="scroll" direction="right">This text is surrounded by HTML 'marquee' tags...</marquee>

<label for=“txtName”>Name : </label>
<input id=“txtName” placeholder="enter name" type="email"/>
<input type="number" min="0" max="10"  step="2" value="4"/>
<input type="range" min="0" max="10"  step="2" value="4"/>

	

</body>
</html>
