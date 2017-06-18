<?php 
$servername = "umbra-corp";
$username = "root";
$password = "arbitrary";
$dbname = "another1";

$conn = new mysqli($servername, $username, $password, $dbname);

if($conn->connect_error){
	die("Connection failed: " . conn->connect_error;
}	

$sql = "INSERT INTO MyGuests (firstname, lastname, email) 
VALUES ($_POST["firstName"], $_POST["lastName"], $_POST["email"])";

if $conn->query($sql) === true){
	echo "New Record Added!";
	}
else{
	echo "Error" . $sql . "<br>" . $conn->error;
}
conn->close();
?>