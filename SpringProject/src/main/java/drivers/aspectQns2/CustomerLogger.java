package drivers.aspectQns2;

import java.util.logging.Logger;


public class CustomerLogger {

    private static Logger logger = Logger.getLogger("CustomerLogger.class");

    public void logBefore(String message) {
        logger.info("Before " + message);
    }

    public void logAfter(String message) {
        logger.info("After " + message);
    }

    public void logAfterReturning(String message) {
        logger.info("AfterReturning " + message);
    }

    public void logAfterThrowing(String message, Throwable throwable) {
        logger.info ("AfterThrowing " + message + ", exception: " + throwable.getMessage());
    }

    public void logAround(String message) {
        logger.info("Around " + message);
    }
}
