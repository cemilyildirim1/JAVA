public class Main {
    public static void main(String[] args) {

        Bilgisayar temelbilgisayar = new TemelBilgisayar();
        System.out.println(temelbilgisayar.aciklama());
        System.out.println(temelbilgisayar.fiyat());


        //Ram eklenmiş

        Bilgisayar rameklenmişbilgisayar = new RamEkleDecorator(new TemelBilgisayar());
        System.out.println(rameklenmişbilgisayar.aciklama());
        System.out.println(rameklenmişbilgisayar.fiyat());

        //ssd eklenmiş bilgisayar

        Bilgisayar depolamabirimieklenmişbilgisayar = new DepolamaBirimiDecorator(new TemelBilgisayar());
        System.out.println(depolamabirimieklenmişbilgisayar.aciklama());
        System.out.println(depolamabirimieklenmişbilgisayar.fiyat());
        
        
        //hem ram gemde ssd eklenmiş

        Bilgisayar depolamarameklenmişbilgisayar = new DepolamaBirimiDecorator(new RamEkleDecorator(new TemelBilgisayar()));
        System.out.println(depolamarameklenmişbilgisayar.aciklama());
        System.out.println(depolamarameklenmişbilgisayar.fiyat());
    }
}