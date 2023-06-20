package drivers.springDay2;

import model.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQns7 {
    public static void main(String[] args) {
        //Reading Configuration from the spring cinfiguration file
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext ( "config.xml" );
        Person person= context.getBean ("personBean", Person.class);
        System.out.println ("Name="+ person.getName() );
        //Closing the context Objetc
        context.close();
    }
}
