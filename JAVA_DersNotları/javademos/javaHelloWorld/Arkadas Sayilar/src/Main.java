public class Main {
    public static void main(String[] args) {
        int sayi1=220;
        int toplam1=0;

        for (int i=1;i<sayi1;i++){
            if(sayi1%i==0){
                toplam1+=i;
            }

        }
        int sayi2=284;
        int toplam2=0;

        for (int j=1;j<sayi2;j++){
            if(sayi2%j==0){
                toplam2+=j;
            }


        }

        System.out.println(toplam1 +" "+ toplam2);
        if (toplam1==sayi2 && toplam2==sayi1){
            System.out.println("Sayıları birbirine arkadaş sayılardır");




        }



    }
}