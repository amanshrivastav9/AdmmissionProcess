
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college_db",
                "root",
                "Amansls@123"
            );
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
