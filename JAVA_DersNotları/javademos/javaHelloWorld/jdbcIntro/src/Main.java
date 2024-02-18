import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static String userName="root";
    static String passaword ="Rize535353.";
    static String dbUrl="jdbc:mysql://localhost:3306/word?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public  static void main(String[] args) throws SQLException {
        Connection connection =null;
        try {
            connection = DriverManager.getConnection(dbUrl,userName,passaword);
            System.out.println("Bağlantı oluştu");
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
        finally {
            connection.close();
        }






    }
}