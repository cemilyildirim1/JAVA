
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cemil
 */
public class JustName extends Isim{
    @Override
    public void isimDegistir(javax.swing.JTextField mail,boolean a){
           
            boolean d =a;
            Connection connection1 = null;
            Statement statement1 = null;
            Statement statement2 = null;
            ResultSet resultSet1 = null;
            ResultSet resultSet2 = null;
            PreparedStatement preparedStatement1 = null;
            ArrayList<String> getName = new ArrayList<>();
            ArrayList<String> getOldName = new ArrayList<>();
            String userMail = mail.getText();

            try {
                connection1 = DbHelperSingleton.getConnection();
                statement1 = connection1.createStatement();

                // 1. Adım: Veriyi Çekme
                resultSet1 = statement1.executeQuery("select * from users where mail='" + userMail + "'");
                if (resultSet1.next()) {
                    getName.add(resultSet1.getString("user_name"));
                    System.err.println(getName.get(0));
                }

                // Bağlantıyı kapat
                if (resultSet1 != null) {
                    resultSet1.close();
                }
                if (statement1 != null) {
                    statement1.close();
                }
                if (connection1 != null) {
                    connection1.close();
                }

                // 2. Adım: Veriyi Güncelleme
                connection1 = DbHelperSingleton.getConnection();
                statement2 = connection1.createStatement();
                resultSet2 = statement2.executeQuery("select name from justname");
                if (resultSet2.next()) {
                    getOldName.add(resultSet2.getString("name"));
                    System.err.println(getOldName.get(0));
                }

                String newName = getName.get(0);
                String oldName = getOldName.get(0);
                System.err.println(getName.get(0));

                // SQL UPDATE ifadesini kullanarak güncelleme yap
                String updateQuery = "UPDATE justname SET name = ? WHERE name = ?";
                preparedStatement1 = connection1.prepareStatement(updateQuery);
                preparedStatement1.setString(1, newName);
                preparedStatement1.setString(2, oldName);
                int result = preparedStatement1.executeUpdate();

            } catch (SQLException exception) {
                DbHelperSingleton.showErrorMessage(exception);
            } finally {
                // Kapatma işlemleri
                try {
                    if (resultSet2 != null) {
                        resultSet2.close();
                    }
                    if (statement2 != null) {
                        statement2.close();
                    }
                    if (preparedStatement1 != null) {
                        preparedStatement1.close();
                    }
                    if (connection1 != null) {
                        connection1.close();
                    }
                } catch (SQLException exception) {
                    
                }
            }
    }
}
