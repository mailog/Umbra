<html>

<head>
	<title> Register </title>
	<script src="//code.jquery/jquey-1.11.0.min.js"></script>
	<script src="/js/register-control.js"></script>
	<link rel="stylesheet" type="text/css" href="/css/drop-down.css" />
	<link rel="stylesheet" type="text/css" href="/css/register.css" />
</head>

<body>
<center>
	<div class = "drop-down-menus">
		<h1 id = "title"><a href = "http://localhost:8080/home">Umbra</a></h1>
		<div class = "companies-dropdown">
 			<button class="companiesbtn">
 			<nav>
 			<a href = "http://localhost:8080/companies">Companies</a>
 			</nav>
 			</button>
 			<div class="companies-content">
    			<a href="http://localhost:8080/companies/taxes">Taxes</a>
    			<a href="http://localhost:8080/companies/analytics">Analytics</a>
    			<a href="http://localhost:8080/companies/consulting">Consulting</a>
    			<a href="http://localhost:8080/companies/marketing">Marketing</a>
  			</div>
  		</div>
  		<div class = "about-dropdown">
 			<button class="aboutbtn">
 			<nav>
 			<a href = "http://localhost:8080/about">About</a>
 			</nav>
 			</button>
 			<div class="about-content">
    			<a href="http://localhost:8080/about/taxes">Taxes</a>
    			<a href="http://localhost:8080/about/analytics">Analytics</a>
    			<a href="http://localhost:8080/about/consulting">Consulting</a>
    			<a href="http://localhost:8080/about/marketing">Marketing</a>
  			</div>
  		</div>
  		<div class = "team-dropdown">
 			<button class="teambtn">
			<nav>
 			<a href = "http://localhost:8080/team">Team</a>
 			</nav>
 			</button>
 			<div class="team-content">
    			<a href="http://localhost:8080/team/taxes">Taxes</a>
    			<a href="http://localhost:8080/team/analytics">Analytics</a>
    			<a href="http://localhost:8080/team/consulting">Consulting</a>
    			<a href="http://localhost:8080/team/marketing">Marketing</a>
  			</div>
  		</div>
  		<div class = "contacts">
  			<button class = "contactsbtn">
			<nav>
 			<a href = "http://localhost:8080/contact">Contact</a>
 			</nav>
			</button>
  		</div>
  		<nav>
			<a href = "http://localhost:8080/login">Login</a>
			<a href = "http://localhost:8080/register">Register</a>
		</nav>
	</div>
	</center>
	
	<center>
	<div class = "register-container">
		<div class = "title">
			<center><h1> Register </h1></center>
		</div>

		<div class = "register">
			<form class = "form-register">
				<input type = "text" placeholder = "Email" id = "input_email"><br>
				<input type = "text" placeholder = "Confirm Email" id = "input_confirm_email"><br><br>
				<input type = "password" placeholder = "Password" id = "input_password"><br>
				<input type = "password" placeholder = "Confirm Password" id = "input_confirm_password"><br>
			</form>
			<button class="registerbtn">Register</button>
		</div>
	</div>
	</center>
</body>
</html>