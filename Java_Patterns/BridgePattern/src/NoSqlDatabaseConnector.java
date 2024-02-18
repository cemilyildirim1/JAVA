public class NoSqlDatabaseConnector implements DatabaseConnector{

    DatabasePlatform platform;

    public NoSqlDatabaseConnector(DatabasePlatform platform){
        this.platform=platform;

    }

    @Override
    public void connect() {
            System.out.println("Nosql veritabanına bağlanıyor...");
            platform.configureConnection();
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Soru çalıştırıldı... "+query);
    }
}
