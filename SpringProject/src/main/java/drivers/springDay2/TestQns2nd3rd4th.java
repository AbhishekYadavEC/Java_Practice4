package drivers.springDay2;

import model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQns2nd3rd4th {
    public static void main(String[] args) {
        //Reading ApplicationContext from the spring ApplicationContext file
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext ( "config.xml" );
        Customer customer=applicationContext.getBean ("myCustomer",Customer.class);
        System.out.println (customer);
    }
}
