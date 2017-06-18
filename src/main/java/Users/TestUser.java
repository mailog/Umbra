package Users;

public class TestUser {
	private String testEmail;
	private String testPassword;
	
	public TestUser(){	
		this.testEmail="";
		this.testPassword = "";
	}
	
	public void setTestEmail(String email){
		this.testEmail = email;
	}
	
	public void setTestPassword(String password){
		testPassword = password;
	}
	
	
	public String getTestEmail(){
		return testEmail;
	}
	
	public String getTestPassword(){
		return testPassword;
	}

}
