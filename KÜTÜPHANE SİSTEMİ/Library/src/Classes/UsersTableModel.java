import javax.swing.table.AbstractTableModel;
import java.util.List;

public class UsersTableModel extends AbstractTableModel {
    private final List<Users> usersList;
    private final String[] columnNames = {"ID", "User Name", "User Surname", "Mail", "Password"};

    public UsersTableModel(List<Users> usersList) {
        this.usersList = usersList;
    }

    public void setUsers(List<Users> usersList) {
        this.usersList.clear();
        this.usersList.addAll(usersList);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return usersList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Users user = usersList.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return user.getId();
            case 1:
                return user.getUser_name();
            case 2:
                return user.getUser_surname();
            case 3:
                return user.getMail();
            case 4:
                return user.getPassword();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}