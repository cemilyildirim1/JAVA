public class Main {
    public static void main(String[] args) {


        for (gunler x : gunler.values()){
            System.out.println(x.name() +"   Gününü hafta içindeki sıralaması : " +x.a);//her günü ve değerini yazdırıyoruz.
        }

    }

    enum gunler{  //enum başlığı altında gunler nesenesine haftanın günlerini atıyoruz.
        pazar(1),// enum kavramında String,int gibi değlerler ile atama yapılmaz.
        pazartesi(2),
        salı(3),
        carsamba(4),
        persembe(5),
        cuma(6),
        cumartesi(7);
        public int a;//a nesnesi oluşturuyoruz
        gunler(int a){// gunler metodunda a nesnesini çağırıp ,//
            this.a=a;     //enum değerlerini enum classındaki a değerlerine atıoyurz.
          }


    }
}