import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
// BarrowBooks DAO sınıfı
class BarrowBooksDAO implements BaseDAO<BarrowBooks> {

    @Override
    public ArrayList<BarrowBooks> getAll() throws SQLException {
        Connection connection = null;
            Statement statement=null;
            ResultSet resultSet;
            ArrayList<BarrowBooks> barrrowBooks = new ArrayList<>();
            
        try{
            connection = DbHelperSingleton.getConnection();
            System.out.println("Baglanti basarili.");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from barrowbooks");
            
            while(resultSet.next()){
                barrrowBooks.add(new BarrowBooks(
                        resultSet.getInt("id"),
                        resultSet.getString("book_name"),
                        resultSet.getString("writer"),
                        resultSet.getInt("page_number"),
                        resultSet.getString("type"),
                        resultSet.getString("barrowTime"),
                        resultSet.getString("taker")
                )
                );
            }
            
        }catch(SQLException exception){
            DbHelperSingleton.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        
        return barrrowBooks;
    }
    
    // Diğer BarrowBooks işlemleri için gerekli metodlar
    // ...
}