import com.sun.nio.sctp.IllegalUnbindException;

public class Main {
    public static void main(String[] args) {

        int[] sayi=new int[]{1,2,3};

        try {
            System.out.println(sayi[3]);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (Exception exception){
            System.out.println("Loglandı");
        }
        finally {
            System.out.println("Her türlü çalışırım.");
        }



    }
}