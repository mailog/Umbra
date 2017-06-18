package umbra;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import javax.crypto.SecretKey;
import Users.UserJDBCTemplate;
import Users.User;


@SpringBootApplication
@Configuration
@ComponentScan
@ImportResource("classpath:Beans.xml")
public class App {

    /**
     * This is a good example of how Spring instantiates
     * objects. The instances generated from this method
     * will be used in this project, where the Autowired
     * annotation is applied.
     */

    /**
     * This is the running main method for tche web application.
     * Please note that Spring requires that there is one and
     * ONLY one main method in your whole program. You can create
     * other main methods for testing or debugging purposes, but
     * you cannot put extra main method when building your project.
     */
	
    public static void main(String[] args) throws Exception {
        // Run Spring Boot
    	
        SpringApplication.run(App.class, args);
    }
}
