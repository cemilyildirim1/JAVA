public class DatabaseHelper {  // bu classın içine 3 ayrı class açıp iç içe olmasını sağladık.
                               // Classlardan ikisini static birini static olmayan class yaptık.
    public static class Crud{ //Create read update delete
        static int a=3;
        public static void update(){

        }
        public static void create(){

        }
        public static void read(){

        }
        public static void delete(){

        }
        }


    public static class Connection{
        int a= 5;
        public static void createConnection(){
            System.out.println("Bağlantı Sağlandı");

        }
    }
    public class Connection2{
        public static void createConnection2(){
            System.out.println("Bağlantı sağlandı statik olmayan class ile");
        }
    }

}
