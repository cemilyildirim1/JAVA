//1210505055 Cemil Yıldırım
public class Main {
    public static void main(String[] args) {

        profMaas prof = new profMaas();   //bütün elemanları newledik.
        asistanMaas asistan = new asistanMaas();
        ogretimGorevlisiMaas ogr= new ogretimGorevlisiMaas();
        akademisyenMaas akademisyen =new akademisyenMaas();

        akademisyen.hesapla(20000);  // ve bütün maaş bilgilerini çağırdık.
        prof.hesapla(250000);
        ogr.hesapla(15000);
        asistan.hesapla(10000);

    }
}