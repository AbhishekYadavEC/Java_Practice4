package drivers.aspect.driver;

import drivers.aspect.appconfiguration.AppConfig;
import drivers.aspect.model1.BeanCalculator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class TestCalculatorQns1 {
    public static void main(String[] args) {
        Logger logger=Logger.getLogger ("Abhishek1691");

        ApplicationContext context=new AnnotationConfigApplicationContext (AppConfig.class);
        BeanCalculator calculator= context.getBean (BeanCalculator.class);
        int result1 = calculator.add(5, 10);
        double result2 = calculator.add(3.5, 2.8);
        String result3 = calculator.add("Hello ", "World");
        int result4 = calculator.subtract(15, 5);
        double result5 = calculator.subtract(10.5, 2.7);
        int result6 = calculator.multiply(4, 6);
        logger.info(result1 );
        logger.info (result2);
        logger.info (result3);
        logger.info (result4);
        logger.info (result5);
        logger.info (result6);

    }
}
