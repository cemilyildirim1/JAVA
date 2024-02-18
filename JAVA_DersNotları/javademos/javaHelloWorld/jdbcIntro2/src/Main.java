import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            String sql ="delete from country where country_id=?";
            connection = helper.getConnection();
            statement=connection.prepareStatement
                    (sql);
            statement.setInt(1,1071);
            int result =statement.executeUpdate();
          System.out.println("Kayıt silindi.");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();

        }


    }
    public static void selectDemo()throws SQLException{

        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {

            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select  country_id,country from country");
            ArrayList<Country> countries= new ArrayList<Country>();
            while (resultSet.next()){
                countries.add(new Country(resultSet.getString("country"),resultSet.getString("country_id")));
            }
            System.out.println(countries.size());

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();

        }

    }
    public static void insertDemo()throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            String sql ="insert into country (country,country_id) values(?,?);";
            connection = helper.getConnection();
            statement=connection.prepareStatement
                    (sql);
            statement.setString(1,"Selçuklu");
            statement.setInt(2,1071);
            int result =statement.executeUpdate();
            System.out.println("Kayıt eklendi.");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
    }

}
public static void updateDemo()throws SQLException{

    Connection connection = null;
    DbHelper helper = new DbHelper();
    PreparedStatement statement = null;
    ResultSet resultSet;
    try {
        String sql ="update country set country_id=2020,country='Türkiye' where country_id=1453";
        connection = helper.getConnection();
        statement=connection.prepareStatement
                (sql);
        int result =statement.executeUpdate();
        System.out.println("Kayıt güncellendi.");

    } catch (SQLException exception) {
        helper.showErrorMessage(exception);
    } finally {
        statement.close();
        connection.close();

    }
}

}