import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Progaram başladı !");
        int a = 0;
        int []  array = new int[3];
        Scanner scanner = new Scanner(System.in);

        try {
            a = 2 / 1;
            System.out.println(a);
            array[0] = 10;
            int sayi = scanner.nextInt();
        }catch (ArithmeticException e){
            System.out.println("0'a bölünme hatası !");
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array boyut hatası ! ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Hata bulundu.");
            System.out.println("Hata : "+ e);
        }finally {
            System.out.println("Finally Kısmı.");
        }

          System.out.println("Program bitti !");
    }

}