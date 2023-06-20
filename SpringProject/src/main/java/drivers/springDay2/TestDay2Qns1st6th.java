package drivers.springDay2;

import model.SpringD2Qns1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDay2Qns1st6th {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext ( "config.xml" );
        SpringD2Qns1 springD2Qns1=(SpringD2Qns1) applicationContext.getBean ("springDay2");
        System.out.println (springD2Qns1);
    }
}
