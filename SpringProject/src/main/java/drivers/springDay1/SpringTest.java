package drivers.springDay1;


import model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {
    public static void main(String[] args) {

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext ( "config.xml" );
        Customer customer=(Customer) applicationContext.getBean ("customerBean1");
        System.out.println (customer );
    }
}
