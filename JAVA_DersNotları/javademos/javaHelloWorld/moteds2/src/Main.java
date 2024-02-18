public class Main {
    public static void main(String[] args) {

        int sayi=toplama(1,2);
        System.out.println(sayi);
        int sayi2=toplama2(1,2,3,4,5,6,76);
        System.out.println(sayi2);





    }
    public static int toplama(int x, int y){
        return x+y;



    }
    public static int toplama2(int ...sayilar){
        int toplam=0;
        for (int a:sayilar){
            toplam+=a;
        }
        return toplam;

    }


}