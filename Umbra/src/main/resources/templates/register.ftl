<html>

<head>
	<title> Register </title>
	<script src="//code.jquery/jquey-1.11.0.min.js"></script>
	<script src="/js/register-control.js"></script>
	<link rel="stylesheet" type="text/css" href="/css/drop-down.css" />
	<link rel="stylesheet" type="text/css" href="/css/register.css" />
	<link rel="stylesheet" type="text/css" href="/css/drop-down-small.css"/>
</head>

<body>
	<div class = "drop-down-menus">
		<a href = "http://www.umbra-corp.com"><img id = "logo" src="U logo.png" alt="Umbra" style="width:24px;height:30px;" ></a>
		<div class = "dropdowns">
			<div class = "industries-dropdown">
 				<button class="industriesbtn">
 				<nav>
 				<a href = "http://www.umbra-corp.com/industries">INDUSTRIES</a>
 				</nav>
 				</button>
 				<div class="industries-content">
    				<a href="http://www.umbra-corp.com/industries-tax">TAX</a>
    				<a href="http://www.umbra-corp.com/industries-consulting">CONSULTING</a>
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
	
	<div class = "drop-down-small">
		<div class = "drop-down-small-drop-down">
			<button class = "drop-down-small-drop-down-btn">
			<nav>
			<a href = "http://www.umbra-corp.com"><img id = "small-logo" src="U logo.png" alt="Umbra" style="width:24px;height:30px;" ></a>
			</nav>
			</button>
			<div class = "drop-down-small-drop-down-content">
				<div class = "drop-down-small-drop-down-industries">
					<a href="http://www.umbra-corp.com/industries">INDUSTRIES</a>
					<!--<div class = "drop-down-small-drop-down-industries-content">
						<a href="http://www.umbra-corp.com/industries-tax">TAX</a>
						<a href="http://www.umbra-corp.com/industries-consulting">CONSULTING</a>
					</div>-->
				</div>
    			<a href="http://www.umbra-corp.com/about">ABOUT</a>
				<a href="http://www.umbra-corp.com/team">TEAM</a>
	    		<a href="http://www.umbra-corp.com/contact">CONTACT</a>
			</div>
		</div>
		
		<nav>
			<a href = "http://www.umbra-corp.com/login">LOGIN</a>
			<a href = "http://www.umbra-corp.com/register">REGISTER</a>
		</nav>
	</div>
	
	
	<center>
	<div class = "register-container">
		<div class = "title">
			<p> R E G I S T E R </p>
		</div>

		<div class = "register">
			<form class = "form-register">
				<p class = "email_text"> Email </p>  
				<input class = "input_email" input type = "text" id = "input_email"><br>
				<p class = "confirme_text"> Confirm Email </p>
				<input class = "input_confirm_email" input type = "text" id = "input_confirm_email"><br><br>
				<p class = "password_text"> Password </p>
				<input class = "input_password" input type = "password" id = "input_password"><br>
				<p class = "confirmp_text"> Confirm Password </p>
				<input class = "input_confirm_password" input type = "password" id = "input_confirm_password"><br>
			</form>
			<button class="registerbtn">SUBMIT</button>
		</div>
	</div>
	</center>
</body>
</html>