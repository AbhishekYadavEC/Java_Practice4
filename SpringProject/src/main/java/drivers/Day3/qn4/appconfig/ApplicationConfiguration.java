package drivers.Day3.qn4.appconfig;

import model.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "model")
public class ApplicationConfiguration {
    @Bean
    public Customer customerBean1(){
        Customer customer = new Customer (101,"Abhishek",30000.0,"Ase", 12);
        return customer;
    }
}

//<!--<bean id="customerBean1" class="model.Customer">
//<constructor-arg index="0" value="101" type="int"/>
//<constructor-arg index="1" value="Abhsihek" type="String"/>
//<constructor-arg index="2" value="30000" type="double"/>
//<constructor-arg index="3" value="Software Engineer" type="String"/>
//<constructor-arg index="4" value="ASE" type="String"/>
//<constructor-arg index="5" value="Nucleus" type="String"/>
//</bean>-->