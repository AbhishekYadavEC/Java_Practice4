package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {

    public static Connection getConnection()
    {
        Connection connection = null;

        try
        {

            Class.forName("oracle.jdbc.driver.OracleDriver");



            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1535:nsbt19c","training","training");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return connection;
    }
}
