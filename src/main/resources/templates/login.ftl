<html>

<head>
	<title> Login </title>
	<script src="//code.jquery.com/jquey-1.11.0.min.js"></script>
	<script src="/js/login-control.js"></script>
	<link rel="stylesheet" type="text/css" href="/css/drop-down.css" />
	<link rel="stylesheet" type="text/css" href="/css/login.css" />
</head>

<body>
	<div class = "drop-down-menus">
		<h1 id = "title"><a href = "http://www.umbra-corp.com">UMBRA</a></h1>
		<div class = "dropdowns">
			<div class = "industries-dropdown">
 				<button class="industriesbtn">
 				<nav>
 				<a href = "http://www.umbra-corp.com/industries">INDUSTRIES</a>
 				</nav>
 				</button>
 				<div class="industries-content">
    				<a href="http://www.umbra-corp.com/industries/tax">TAX</a>
    				<a href="http://www.umbra-corp.com/industries/consulting">CONSULTING</a>
  				</div>
  			</div>
  			<div class = "about-dropdown">
 				<button class="aboutbtn">
 				<nav>
 				<a href = "http://www.umbra-corp.com/about">ABOUT</a>
 				</nav>
 				</button>
  			</div>
  			<div class = "team-dropdown">
 				<button class="teambtn">
				<nav>
 				<a href = "http://www.umbra-corp.com/team">TEAM</a>
 				</nav>
 				</button>
  			</div>
  			<div class = "contacts">
  				<button class = "contactsbtn">
				<nav>
 				<a href = "http://www.umbra-corp.com/contact">CONTACT</a>
 				</nav>
				</button>
  			</div>
  		</div>
  		<nav>
			<a href = "http://www.umbra-corp.com/login">LOGIN</a>
			<a href = "http://www.umbra-corp.com/register">REGISTER</a>
		</nav>
	</div>
	<center>
	<div class = "login-container">
		<div class = "title">
			<p> L O G I N </p>
		</div>

		<div class = "login">
			<form class = "form-login">
				<p class = "email_text"> Email </p>  
				<input class = "input_email" input type = "text" id = "input_email"><br><br>
				<p class = "password_text"> Password </p>
				<input class = "input_password" input type = "password" id = "input_password"><br>
			</form>
			<button class="loginbtn">SUBMIT</button>
		</div>
	</div>
	</center>
</body>
</html>