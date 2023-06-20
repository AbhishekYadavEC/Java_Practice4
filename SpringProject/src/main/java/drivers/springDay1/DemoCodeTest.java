package drivers.springDay1;

import model.DemoCode;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/* Java program to illustrate
 the client to perform the
 request to the defined bean
 Client Class to request the
 above defined bean*/
public class DemoCodeTest {

    public static void main(String[] args) {

        // Load the Spring XML configuration
        // file into IoC container
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext ("config.xml");

        // and call getName() method
        DemoCode demoCode=(DemoCode) applicationContext.getBean ("myDemo1");

        // Set the name
        demoCode.setName ("Abhishek");
        System.out.println(" Your name is: " + demoCode.getName ( ));

        // and call getName() method
        DemoCode demoCode1 = (DemoCode) applicationContext.getBean ("myDemo1");

        System.out.println(" Your name is: " + demoCode1.getName ( ));

        // Now compare the references to see
        // whether they are pointing to the
        // same object or different object
        System.out.println ("'demoCode' and 'demoCode1'" + " are referring" + "to the same object: " + (demoCode == demoCode1));

        // Print the address of both
        // object demoCode and demoCode1
        System.out.println  ("Address of object demoCode: " + demoCode);
        System.out.println ("Address of object demoCode1: " + demoCode1);
    }
}
