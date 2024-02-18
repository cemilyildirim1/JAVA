public class Main {
    public static void main(String[] args) {

        DatabaseConnector relationalDbConnector = new RelationalDatabaseConnector(new MySqlConnection());
        relationalDbConnector.connect();
        relationalDbConnector.executeQuery("select * from tblUsers");


        DatabaseConnector noSqlDatabaseConnector = new NoSqlDatabaseConnector(new MongoDbConnection());
        noSqlDatabaseConnector.connect();
        noSqlDatabaseConnector.executeQuery("db.users.find()");

    }
}