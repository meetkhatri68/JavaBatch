<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
        body 
        {
            margin: 0;
            padding: 0;
            overflow-x: hidden;
        }
        #slider
        {
            width: 100%;
            height: 450px;
        }
        #slider img 
        {
            width: 100% !important;
            height: 450px !important;
        }

        #frm
        {
            width: 50%;
            height: auto;
            margin: auto;
            padding: 15px;
            margin-top: 5%;
            box-shadow: 2px 2px 2px 2px gray;
        }

        input 
        {
            width: 250px;
            height: auto;
            padding: 8px;
        }
        input[type="submit"]
        {
            width: 150px;
            height: auto;
            padding: 8px;
            background-color: red;
            border: none;
            color: white;
        }
    </style>
   

</head>
<body>

	<section id="frm">
     <form id="frm_valid" action="welcome.html">

        <input type="text" name="fname" placeholder="FirstName *" data-bvalidator="required,alpha">
        <br><br>
        
        <input type="text" name="lname" data-bvalidator="required,alpha" placeholder="LastName *">
        <br><br>
        
        <input type="text" name="email" placeholder="Email *" data-bvalidator="required,email">
        <br><br>

        <input type="password" name="password" placeholder="Password *" data-bvalidator="required,minlen[5],maxlen[12]">
        <br><br>
        
        <input type="text" name="Mobile" placeholder="Mobile *" data-bvalidator="required,minlen[10],maxlen[10],digit">
        <br><br>
        <input type="submit" name="register" value="Register">
        <br><br>

     </form>
    </section>

 <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
 
     <!-- bvalidator plugins file -->
     
     
     <script src="js/jquery.bvalidator.min.js"></script>
     <script src="js/default.min.js"></script>
     <script src="js/gray.js"></script>
     <!-- form validation applied bvalidator -->
    <script>
        $(document).ready(function()
        {
            $("#frm_valid").bValidator();
        })
    </script>

 
    <!-- cycle jquery plugins -->
    <script src="https://malsup.github.io/jquery.cycle.all.js"></script>
   
    <!-- slider jquery code -->
    <script>
        $(document).ready(function(){
            $("#slider").cycle("fade,zoom,shuffle");
        })
    </script>

</body>
</html>