import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
class BooksDAO implements BaseDAO<Books> {

    @Override
    public ArrayList<Books> getAll() throws SQLException {
        Connection connection = null;
            Statement statement=null;
            ResultSet resultSet;
            ArrayList<Books> books = new ArrayList<>();
            
        try{
            connection = DbHelperSingleton.getConnection();
            System.out.println("Baglanti basarili.");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from books");
            
            while(resultSet.next()){
                books.add(new Books(
                        resultSet.getInt("id"),
                        resultSet.getString("book_name"),
                        resultSet.getString("writer"),
                        resultSet.getInt("page_number"),
                        resultSet.getString("type")
                )
                );
            }
            
        }catch(SQLException exception){
            DbHelperSingleton.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        
        return books;
    }
    
    
}