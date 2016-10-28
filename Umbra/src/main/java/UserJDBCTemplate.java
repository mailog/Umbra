import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserJDBCTemplate implements UserDAO{
	
	private DataSource datasource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource ds){
		this.datasource = ds;
		jdbcTemplateObject = new JdbcTemplate(datasource);
	}
	
	public void create(String firstName, String lastName){
		String SQL = "insert into test (firstname, lastname) values (?,?)";
		
		jdbcTemplateObject.update(SQL, firstName, lastName);
		System.out.println("Created Record Name: " + firstName + " " + lastName ".");
		return;
	}
	
	public User getUser(String email){
		String SQL = "select * from User where email=?";
		
		User user = jdbcTemplateObject.query(SQL, new Object[]{email}, new UserMapper());
		return user;
	}
	
	public List<User> listStudents(){
		String SQL = "select * from User";
		
		List<User> users = jdbcTemplateObject.query(SQL, new UserMapper());
		return users;
	}
	
	public void delete(String email){
		String SQL = "delete from User where email = ?";
		jdbcTemplateObject.update(SQL, email);
		System.out.println("Deleted " + email + " from Users");
	}
	
	public void update(String email, String firstName, String lastName){
		String SQL = "update User set firstname = ? where email = ?";
		
		jdbcTemplateObject.update(SQL, firstName, email);
		System.out.println("Updated " + email);
	}

}
