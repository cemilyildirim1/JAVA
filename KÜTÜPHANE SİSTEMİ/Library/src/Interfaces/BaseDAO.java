import java.sql.SQLException;
import java.util.ArrayList;

public interface BaseDAO<T> {
    ArrayList<T> getAll() throws SQLException;
}

