import java.sql.*;


public class DbHelper {
    final String userName = "root";
    final String password = "12345";
    final String dbUrl = "jdbc:mysql://localhost:3306/library";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }

    public void showErrorMessage(SQLException exception) {
        System.out.println("Error: " + exception.getMessage());
    }
}


