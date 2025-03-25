import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee_db"; 
        String user = "root";
        String password = "Deeraj123@";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println(" Connected to MySQL successfully!");

            // Close connection
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println(" MySQL Driver not found! Add JDBC Jar.");
            
        } catch (SQLException e) {
            System.out.println("Connection failed! Check database settings.");
           
        }
    }
}
