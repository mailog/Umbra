package Users;

public class User {
	private String email;
	private String plainPassword;
	private byte[] encryptedPassword;
	public User(){	
		this.email="";
		this.plainPassword = "";
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setPlainPassword(String password){
		plainPassword = password;
	}
	
	public void setEncryptedPassword(byte[] password){
		this.encryptedPassword = password;
		
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getPlainPassword(){
		return plainPassword;
	}
	
	public byte[] getEncryptedPassword(){
		return encryptedPassword;
	}
	

}
