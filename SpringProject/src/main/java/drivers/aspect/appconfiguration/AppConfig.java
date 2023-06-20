package drivers.aspect.appconfiguration;

import drivers.aspect.model1.BeanCalculator;
import drivers.aspect.model1.CalculatorLoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "java.drivers.aspect")
public class AppConfig {

    @Bean
    public BeanCalculator beanCalculator() {
        return new BeanCalculator();
    }

    @Bean
    public CalculatorLoggingAspect calculatorLoggingAspect() {
        return new CalculatorLoggingAspect();
    }

}
