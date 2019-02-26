<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>
            Login page
        </title>
      
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="Login_style1.css">
  <style>

    .btn-default  {
    background :	#D3D3D3;
    color: #000;
    box-shadow: 1px 2px 5px #000000;
    border-radius: 16px;
     padding: 10px 20 px;
     font-size: 15px;
    width: 10%;
    margin :5px 0;
    
  }
.btn-default :hover {
   
    background: #fff;
    color:	#D3D3D3;
  }

      </style>

    </head>
    <body>
        <form action="AdminHome.html" method="POST">
            <div class="container">
            <div class="top">
                <img src="img.png" alt="img">
            </div>
            <div class="bottom">

               
                <input type="text"  class="form-control" placeholder="Username" id="Username"><br>
                <input type="password" class="form-control" placeholder="password" value="password"><br>
                <button type="submit" class="btn btn-default" >Login</button>
              

            </div>

        </div>
    </form>

    </body>
</html>