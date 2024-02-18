import java.util.Scanner;

public class MatrisSabitSayiCarpma {

    public  void MatrisSabitSayiCarpma(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen matrisin çarpılacağı sabit sayıyı giriniz");
        int sayi=scanner.nextInt();
        System.out.println("Lütfen Matrisin satır ve sütun bilgisini giriniz.");
        System.out.println("Lütfen satır bilgisini giriniz.");
        int satir = scanner.nextInt();
        System.out.println("Sütun bilgisini giriniz.");
        int sutun =scanner.nextInt();




        int [][] matris= new int[satir][sutun];
        int [][] cevap = new int[satir][sutun];
        int [][] sabit = new int[satir][sutun];



        for (int i=0;i<satir;i++){
            for (int j=0;j<sutun;j++){
                System.out.println("Lütfen  "+(i+1)+" inci satır ve "+(j+1)+" inci sütundaki elemanı yazınız");
                matris[i][j]=scanner.nextInt();
                sabit[i][j]=sayi;
                cevap[i][j]=sabit[i][j]*(matris[i][j]);


            }
        }
        System.out.println("Matris çıktısı");
        for (int i=0;i<satir;i++){
            for (int j=0;j<sutun;j++){
                System.out.print(matris[i][j]+ "\t" );
            }
            System.out.println();
        }

        System.out.println("Matris çarpımının çıktısı");
        for (int i=0;i<satir;i++){
            for (int j=0;j<sutun;j++){
                System.out.print(cevap[i][j]+ "\t" );
            }
            System.out.println();
        }



    }
}