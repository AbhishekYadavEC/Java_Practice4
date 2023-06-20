package drivers.Day3.qn4;

import model.User;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class practiceType {
    public static void main(String[] args) {
        //AbstractApplicationContext with the help of we can call destroy method
        AbstractApplicationContext context=new ClassPathXmlApplicationContext ( "practiceConfig.xml" );
        User user2=(User) context.getBean ("LifeCycle");
        System.out.println (user2 );
        //registering shutdown hook to call destroy method
        context.registerShutdownHook ();

        System.out.println ("+++++++++++++++++++================++++++++++++++++++++++++++++" );

        /*ApplicationContext applicationContext=new ClassPathXmlApplicationContext ( "practiceConfig.xml" );
        Address address1=(Address) applicationContext.getBean ("LifeCycle1");
        System.out.println (address1 );*/

    }
}
