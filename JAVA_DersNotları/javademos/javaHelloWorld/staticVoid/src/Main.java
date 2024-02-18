


public class Main {
    public static void main(String[] args) {

        System.out.println(DatabaseHelper.Crud.a); // static olan classları çağırırken newleme işlemi yapmak gerekli değildir.

        DatabaseHelper.Connection.createConnection();//classlarımızı çağırıp fonksiyonları yazdırdık

        DatabaseHelper databaseHelper=new DatabaseHelper();//static olmaya class ile newleme işlemi yaparak çağırma gereklidir.

        DatabaseHelper.Connection2.createConnection2();//classlarımızı çağırıp fonksiyonları yazdırdık











    }
}