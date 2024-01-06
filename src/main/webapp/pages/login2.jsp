
<h1 style="color:red">${message}</h1>

<form>

	<input name="username" placeholder="Enter username"><span style="color:red;font-size: 20px" > ${message1}</span>  
	
	<br><br>
	
	<input type="password" name="password" placeholder="Enter password"><span style="color:red;font-size: 20px" placeholder="Enter password"> ${message2}</span>
	
	<br><br>
	
	<input type=submit value="login" formaction="validate" formmethod="get">
	<input type=submit value="register" formaction="showRegister" formmethod="get">
	
</form>