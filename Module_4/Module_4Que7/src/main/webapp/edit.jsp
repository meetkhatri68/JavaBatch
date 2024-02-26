<%@page import="com.dao.Dao"%>
<%@page import="com.model.Model"%>
<%@page import="java.awt.event.ActionListener"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        *{
	padding: 0;
	margin: 0;
}
body{
  background: url(http://wrbbradio.org/wp-content/uploads/2016/10/grey-background-07.jpg) no-repeat center fixed;
  background-size: cover;
}

.container{
	background: #2d3e3f;
	width: 350px;
	height: 600px;
	padding-bottom: 20px;
	position: absolute;
	top:50%;
	left: 50%;
	transform: translate(-50%, -50%);
	margin: auto;
  padding: 70px 50px 20px 50px;
}


.fl{
	float: left;
  width: 110px;
  line-height: 35px;
}

.fontLabel{
  color: white;
}

.fr{
	float: right;
}

.clr{
	clear: both;
}

.box{
	width: 360px;
	height: 35px;
	margin-top: 10px;
	font-family: verdana;
	font-size: 12px;
}

.textBox,.select{
	height: 35px;
	width: 190px;
	border: none;
  padding-left: 20px;
}

.new{
  float: left;
}

.iconBox{
	height: 35px;
	width: 40px;
	line-height: 38px;
	text-align: center;
  background: #ff6600;
}

.radio{
	color: white;
	background: #2d3e3f;
	line-height: 38px;
}

.terms{
	line-height: 35px;
	text-align: center;
	background: #2d3e3f;
	color: white;
}

.submit{
	float: right;
	border: none;
	color: white;
	width: 110px;
	height: 35px;
	background: #ff6600;
	text-transform: uppercase;
  cursor: pointer;
}

.submit:hover{
background-color: black;
  color:white;
}


::-webkit-input-placeholder { /* Chrome/Opera/Safari */

}



</style>
<script type="text/javascript">

	//ALphabet validation
		function isAlphabet(elem, helperMsg)
		{
			var alphaExp = /^[a-zA-Z]+$/;
			if(elem.value.match(alphaExp)){
				return true;
			}else
			{
				alert(helperMsg);
			
				return false;
			}
		}

	//Number Validation
	function isNumeric(elem, helperMsg)
	{
		var numericExpression = /^[0-9]+$/;
		if(elem.value.match(numericExpression)){
			return true;
		}else{
			alert(helperMsg);
			return false;
		}				
	}

	//Email Validation
	
	function emailValidator(elem, helperMsg)
	{
		var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;

		if(elem.value.match(emailExp))
		{
			return true;
		}
		else
			{
			alert(helperMsg);
			return false;
		}
	}


</script>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

<%
	String id = request.getParameter("id");
	int id2 = Integer.parseInt(id);
	Model m = Dao.getelementbyid(id2);

%>

	
		
		<div class="container">
      <form action="edit2.jsp">
      	<!-- id -->
      	<div class="box">
          <label for="Id" class="fl fontLabel"> ID: </label>
    			<div class="new iconBox">
            <i class="fa fa-user" aria-hidden="true"></i>
          </div>
    			<div class="fr">
    					<input type="text" name="id" id="id" placeholder="id" 
              			class="textBox"   value="<%=m.getId() %>"required>
    			</div>
    			<div class="clr"></div>
    		</div>
      	
     
        <!--First name-->
    		<div class="box">
          <label for="firstName" class="fl fontLabel"> First Name: </label>
    			<div class="new iconBox">
            <i class="fa fa-user" aria-hidden="true"></i>
          </div>
    			<div class="fr">
    					<input type="text" name="fname" id="fname" placeholder="First Name" 
              			class="textBox"   onblur="isAlphabet(document.getElementById('name'), 'Letters Only Please')" value="<%=m.getFname() %>"required>
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!--First name-->


        <!--Second name-->
    		<div class="box">
          <label for="surname" class="fl fontLabel"> Last Name: </label>
    			<div class="fl iconBox"><i class="fa fa-user" aria-hidden="true"></i></div>
    			<div class="fr">
    					<input type="text" name="lname" id="lname" placeholder="Last Name" class="textBox" onblur="isAlphabet(document.getElementById('surname'), 'Letters Only Please')" value="<%=m.getLname() %>" required >
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!--Second name-->


    		<!---Phone No.------>
    		<div class="box">
          <label for="phone" class="fl fontLabel"> Phone No.: </label>
    			<div class="fl iconBox"><i class="fa fa-phone-square" aria-hidden="true"></i></div>
    			<div class="fr">
    					<input type="text" required name="phone" id="phone" maxlength="10" placeholder="Phone No." class="textBox"  value="<%=m.getPhone() %>"  onblur="isNumeric(document.getElementById('phone'),'Enter NUmber only for o=phone number!')">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!---Phone No.---->


    		<!---Email ID---->
    		<div class="box">
          <label for="email" class="fl fontLabel"> Email ID: </label>
    			<div class="fl iconBox"><i class="fa fa-envelope" aria-hidden="true"></i></div>
    			<div class="fr">
    					<input type="email" required name="email" id="email" placeholder="Email Id" class="textBox"  value="<%=m.getEmail() %>" onblur="emailValidator(document.getElementById('email'), 'Not a Valid Email')">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!--Email ID----->
    		
    		
    		
    		
    		
    		<!---Gender----->
    		<div class="box radio">
          <label for="gender" class="fl fontLabel"> Gender: </label>
          <div class="new iconBox">
            <i class="fa fa-mars" aria-hidden="true"></i>
          </div>
    				<input style="margin-left: 20px" type="radio" name="gender" id="male" value="Male" required> Male &nbsp; &nbsp; &nbsp; &nbsp;
    				<input type="radio" name="gender" id="female" value="Female" required> Female
    		</div>
    		
    		<!---Gender--->
    		

    		<!---Password------>
    		<div class="box">
          <label for="password" class="fl fontLabel"> Password </label>
    			<div class="fl iconBox"><i class="fa fa-key" aria-hidden="true"></i></div>
    			<div class="fr">
    					<input type="Password" required name="password" id="password" placeholder="Password" class="textBox" value="<%=m.getPassword()%>">
    			</div>
    			<div class="clr"></div>
    		</div>
    		<!---Password---->

    		


    		<!--Terms and Conditions------>
    		<div class="box terms">
    				<input type="checkbox" name="Terms" required> &nbsp; I accept the terms and conditions
    		</div>
    		<!--Terms and Conditions------>



    		<!---Submit Button------>
    		<div class="box" style="background: #2d3e3f">
    				<input type="Submit" name="Edit" class="submit" value="Edit" >
    		</div>
    		<!---Submit Button----->
    		<div  >
    		<a href="Show.jsp" style="color: white" > Show Data</a>
    		</div>
      </form>
  </div>
  <!--Body of Form ends--->
  </body>
		
	
</body>
</html>