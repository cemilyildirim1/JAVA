import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelperSingleton {
    private static final String URL = "jdbc:mysql://localhost:3306/library";
    private static final String KULLANICI_ADI = "root";
    private static final String SIFRE = "12345";
    
    private static Connection connection;

    
    public DbHelperSingleton() {
    }

    // Bağlantı örneğini almak için genel metot
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            // Bağlantı yoksa veya kapatılmışsa yeni bir bağlantı oluştur
            connection = DriverManager.getConnection(URL, KULLANICI_ADI, SIFRE);
        }
        return connection;
    }

    // Diğer hata işleme, kaynakları kapatma gibi metotlar

    public static void showErrorMessage(SQLException exception) {
        // Hata mesajlarını işle
        System.err.println("Veritabanı Hatası: " + exception.getMessage());
    }
}
