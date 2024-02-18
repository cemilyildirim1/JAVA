import matematik.*;//veya matematik.logaritma matematik.dortislem//"*" hepsini çağırır
import matematik.Dortislem;// dört işle paketini çağırır
import java.util.Scanner;//Scanner paketini çağırır

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); // Scanner paketini "scanner" adıyla çağırıyoruz.

        System.out.println("İsim giriniz:");
        String isim = scanner.nextLine(); //isim adlı değişkene atıyoruz ve scan(kullanıcıdan istiyoruz)// ediyoruz.
        System.out.println("Merhaba "+isim);

        Dortislem dortislem=new Dortislem(); // dortislem adlı değişkene atıyoruz.

        System.out.println("Dört işlemin sonucu: "+dortislem.topla(3,4));//verilen değerler ile işlem yapıp yazdırıyoruz.

        Logaritma logaritma=new Logaritma();//logaritma isimli değişkene atıyoruz(gerçek logaritma işlemi yoktur.Örnek amaçlıdır.)
        System.out.println("Logaritma işleminin sonucu: "+logaritma.logaritmahesapla());


    }
}