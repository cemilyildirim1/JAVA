

import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException{
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement =  null;
        Statement statement_select =null;
        ResultSet resultSet;



        try{
            connection = dbHelper.getConnection(); // bağlama burda .Dphelper classından çekiliyor
            System.out.println("Bağlantı başarılı");
            statement = connection.prepareStatement("insert into aletler(alet) values ('telefon')");
            System.out.println("Kayıt eklendi");
            statement_select = connection.createStatement();
            resultSet = statement_select.executeQuery("select * from aletler");

            while (resultSet.next()){
                System.out.println(resultSet.getString("alet"));
            }
        }catch (SQLException e){
            dbHelper.showErrorMessage(e);
        }finally {
            connection.close();
        }
    }
    public static void selectDemo() throws SQLException{
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement =null;
        ResultSet resultSet =null;
        try{
            connection = dbHelper.getConnection();
            System.out.println("Bağlantı oluştu");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()){
                countries.add(new Country(
                                resultSet.getString("Code"),
                                resultSet.getString("Name"),
                                resultSet.getString("Continent"),
                                resultSet.getString("Region")

                        )
                );

                System.out.println(resultSet.getString("name"));
            }
            System.out.println("Ülke isimleri sayısı");
            System.out.println(countries.size());


        }catch (SQLException e){
            dbHelper.showErrorMessage(e);
        }
        finally {
            try{
                connection.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
                //System.out.println("Bağlantı Kapatılamaz çünkü bağlantı oluşmadı...");
            }

        }
    }
}