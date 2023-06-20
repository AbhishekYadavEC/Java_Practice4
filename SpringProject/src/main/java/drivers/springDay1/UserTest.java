package drivers.springDay1;

import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext ( "config.xml" );
        User myUser=(User) applicationContext.getBean ("mainUser");
        System.out.println (myUser );
    }
}
