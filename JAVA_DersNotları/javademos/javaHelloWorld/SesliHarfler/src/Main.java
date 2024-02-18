import javax.lang.model.util.SimpleElementVisitor14;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi=8128;
        int toplam=0;
        for (int i=1;i<=sayi;i++){
            if (sayi%i==0){
                toplam+=i;

            }

        }

        if (toplam==sayi*2){
            System.out.println(sayi+"-Sayısı bir mükemmel sayıdır.");

        }
    }

}