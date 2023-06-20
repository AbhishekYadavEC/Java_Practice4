package drivers.aspectQns2;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomerAdvice {

    private CustomerLogger logger = new CustomerLogger();

    @Before("execution(* com.example.customer.service.CustomerService.printCustomers(..))")
    public void beforePrintCustomers(JoinPoint joinPoint) {
        logger.logBefore("Printing all customers");
    }

    @After("execution(* com.example.customer.service.CustomerService.updateCustomer(..))")
    public void afterUpdateCustomer(JoinPoint joinPoint) {
        logger.logAfter("Updated customer record");
    }

    @AfterReturning(pointcut = "execution(* com.example.customer.service.CustomerService.getCustomerById(..))", returning = "result")
    public void afterReturningGetCustomerById(JoinPoint joinPoint, Object result) {
        logger.logAfterReturning("Returned customer with Id " + result);
    }

    @AfterThrowing(pointcut = "execution(* com.example.customer.service.CustomerService.getCustomerById(..))", throwing = "exception")
    public void afterThrowingGetCustomerById(JoinPoint joinPoint, Throwable exception) {
        logger.logAfterThrowing("Error occurred while searching customer with Id " + joinPoint.getArgs()[0], exception);
    }

    @Around("execution(* com.example.customer.service.CustomerService.registerCustomer(..))")
    public void aroundRegisterCustomer(ProceedingJoinPoint joinPoint) throws Throwable {
        int age = (int) joinPoint.getArgs()[2];
        if (age < 21) {
            logger.logAround("Customer registration failed, age is less than 21");
            return;
        }
        logger.logAround("Registering customer with name " + joinPoint.getArgs()[0]);
        joinPoint.proceed();
    }

    @Before("execution(* com.example.customer.service.CustomerService.getCustomerByName(..))")
    public void beforeGetCustomerByName(JoinPoint joinPoint) {
        logger.logBefore("Searching for customer with name " + joinPoint.getArgs()[0]);
    }
}
