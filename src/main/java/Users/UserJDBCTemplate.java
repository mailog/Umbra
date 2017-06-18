package Users;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import Security.EncryptMethod;

public class UserJDBCTemplate implements UserDAO{
	
	private static DataSource datasource;
	private static JdbcTemplate jdbcTemplateObject;
	private static EncryptMethod encrypter;
	
	public void setDataSource(DataSource ds){
		encrypter = new EncryptMethod();
		this.datasource = ds;
		jdbcTemplateObject = new JdbcTemplate(datasource);
	}
	
	public void create(String email, String password){
		byte[] encrypted = encrypter.encrypt(password);
		
		String SQL = "insert into legitTable (email, password) values (?,?)";
			
		System.out.println(encrypted.toString());
		
		jdbcTemplateObject.update(SQL, email, encrypted);
		System.out.println("Created Record Name: " +" Email: " + email + " PW: " + password);
	}
	
	public User getUser(String email){
		String SQL = "select * from legitTable where email=?";
		User user = jdbcTemplateObject.queryForObject(SQL, new Object[]{email}, new UserMapper());
		return user;
	}
	
	public List<User> listUsers(){
		String SQL = "select * from User";
		List<User> users = jdbcTemplateObject.query(SQL, new UserMapper());
		return users;
	}
	
	public void delete(String email){
		String SQL = "delete from legitTable where email = ?";
		jdbcTemplateObject.update(SQL, email);
		System.out.println("Deleted " + email + " from Users");
	}
	
	public void update(String email, String password){
		String SQL = "update legitTable set password = ? where email = ?";
		
		jdbcTemplateObject.update(SQL, password, email);
		System.out.println("Updated " + email);
	}

}
