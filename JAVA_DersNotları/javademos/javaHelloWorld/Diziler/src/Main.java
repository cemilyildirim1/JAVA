import javax.xml.parsers.SAXParser;

public class Main {
    public static void main(String[] args) {
        String[] ogrenciler=new String [3];
        ogrenciler[0]="Cemil";
        ogrenciler[1]="özge";
        ogrenciler[2]="cevdet";
        for (int i=0;i<3;i++){
            System.out.println(" Ogrenci:"+ogrenciler[i]);


        }
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);

        }
    }
}