import java.util.List;
import javax.sql.DataSource;
public interface UserDAO {
	
	public void setDataSource(DataSource ds);
	
	public void create(String firstName, String lastName);
	
	public User getUser(String email);
	
	public List<User> listStudents();
	
	public void delete(String email);
	
	public void update(firstName, lastName);
}
