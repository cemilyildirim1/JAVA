public class Main {
    public static void main(String[] args) {
        sayiBulmaca();



    }

    public static void sayiBulmaca() {

        int[] sayi = new int[]{1, 7, 9, 5, 0};
        int aranacak = 5;

        for (int x : sayi) {
            if (x == aranacak) {

                System.out.println("Aranacak sayi bulundu.Ve aranacak sayi = " + x);
                mesajVer("Aranacak sayi bulundu.Ve aranacak sayi = "+x);
                return;


            }
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);


    }
}