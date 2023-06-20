package drivers.aspect.model1;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Component
public class CalculatorLoggingAspect {
    Logger logger=Logger.getLogger ("Abhishek16915");
    @AfterReturning(pointcut = "execution(* BeanCalculator.multiply(..))", returning = "result")
    public void logAfterMultiply(JoinPoint joinPoint, Object result) {
        logger.info ("Multiplication Result: " + result);
    }

    @AfterThrowing(pointcut = "execution(* BeanCalculator.divide(..))", throwing = "ex")
    public void logAfterThrowingDivide(JoinPoint joinPoint, ArithmeticException ex) {
        logger.info ("Error occurred during division: " + ex.getMessage());
    }

    @After("execution(* BeanCalculator.add(..))")
    public void logAfterAdd(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        logger.info ("Addition Args: " + args[0] + ", " + args[1]);
    }

    @Before("execution(* BeanCalculator.subtract(..))")
    public void logBeforeSubtract(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        logger.info ("Subtraction Args: " + args[0] + ", " + args[1]);
    }

}
