package DBconnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection {
       private static final String url = "jdbc:postgresql://localhost:5432/gestionIpset";
       private static final String user = "postgres";
       private static final String password = "";
       
       private static Connection connection;
       
       public static Connection getConnection(){
           try {
                connection = DriverManager.getConnection(url, user, password);
                System.out.println(connection);
           }catch (SQLException e){
               e.printStackTrace();
           }
           return connection;
       }
    
}
