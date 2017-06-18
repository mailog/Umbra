function testInput(){
	var firstName = $('#firstname').val();
	var lastName = $('#lastname').val();
	var email = $('#email').val();
	var cook = document.cookie;
	cook = "user="+firstName + " " + lastName +" email = " + email + "expires= Sunday, 30 October 2017 00:00:00 GMT";
	window.alert(cook);
}