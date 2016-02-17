<!DOCTYPE html>
<html>
<head>
<title>16th Feb 2016</title>
</head>
<body>

<form action="login" method="POST">
  Username:<br>
  <input type="text" name="username"><br><br>
  Password:<br>
  <input type="text" name="password"><br>
  
 <p id="errorMessage" style="color:red;">
  <%
            String result = null;
            result = (String)request.getAttribute("loginResult");
           
            
                if(("empty").equals(result)) {
                    out.println("Username and password are required");
                }else if(("incorrect").equals(result)){
                	out.println("Incorrect username or password");
                }
            %></p>
             <input type="submit" name="submitButton" value="Submit"><br>
</form>
</body>
</html>
