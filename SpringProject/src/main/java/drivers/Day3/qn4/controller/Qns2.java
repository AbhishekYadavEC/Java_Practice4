package drivers.Day3.qn4.controller;

import drivers.Day3.qn4.appconfig.ApplicationConfiguration;
import model.Customer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Qns2 {
    public static void main(String[] args) {
        //Spring Day-1 (Ans-1)
        ConfigurableApplicationContext applicationContext= new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Customer customer=(Customer) applicationContext.getBean("customerBean1");
        System.out.println (customer);
    }
}
