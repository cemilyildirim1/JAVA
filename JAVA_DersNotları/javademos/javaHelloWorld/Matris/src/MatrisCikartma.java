import java.util.Scanner;

public class MatrisCikartma {

    public void MatrisCikartma(){

        Scanner scanner=new Scanner(System.in);



        System.out.println("Lütfen Matris1'in satır ve sütun bilgisini giriniz.");
        System.out.println("Lütfen Matris1'in satır bilgisini giriniz.");
        int satir1 = scanner.nextInt();
        System.out.println("Lütfen Matris1'in Sütun bilgisini giriniz.");
        int sutun1 =scanner.nextInt();

        System.out.println("Lütfen Matris2'in satır ve sütun bilgisini giriniz.");
        System.out.println("Lütfen Matris2'in satır bilgisini giriniz.");
        int satir2 = scanner.nextInt();
        System.out.println("Lütfen Matris2'in Sütun bilgisini giriniz.");
        int sutun2 =scanner.nextInt();





        double [][] matris1   = new double[satir1][sutun1];
        double [][] matris2   = new double[satir2][sutun2];
        double [][] matrisFarki   = new double[satir1][satir1];

        if (satir1==satir2 && sutun1==sutun2){
            for (int i=0;i<satir1 && i<satir2;i++){ //satir1 ve satir2 değerleri aynıdır.Aynı olmasaydı zaten döngüye giremezdi.Sadece satir1 veya satir2 de yazılabilir.
                for (int j=0;j<sutun1 && j<sutun2;j++){//sutun1 ve sutun2 değerleri aynıdır.Aynı olmasaydı zaten döngüye giremezdi.Sadece sutun1 veya sutun2 de yazılabilir.
                    System.out.println("Lütfen Matris1'in "+(i+1)+" inci satır ve "+(j+1)+" inci sütundaki elemanı yazınız");

                    matris1[i][j]=scanner.nextDouble();

                    System.out.println("Lütfen Matris2'nin "+(i+1)+" inci satır ve "+(j+1)+" inci sütundaki elemanı yazınız");

                    matris2[i][j]=scanner.nextDouble();

                    matrisFarki[i][j]=matris1[i][j]-matris2[i][j];

                }


            }
        }


        else {
            System.out.println("Girilecek satır ve sütun değerleri aynı olmalıdır lütfen tekrar deneyiniz");
            return;

        }
        System.out.println("Matris 1 : ");
        for (int i=0;i<satir1;i++){

            for (int j=0;j<sutun1;j++){
                System.out.print(matris1[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.println("Matris 2 :");
        for (int i=0;i<satir1;i++){

            for (int j=0;j<sutun1;j++){
                System.out.print(matris2[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.println("Matris Farkının Cevabı : ");

        for (int i=0;i<satir1;i++){

            for (int j=0;j<sutun1;j++){
                System.out.print(matrisFarki[i][j] + "\t");


            }
            System.out.println();
        }
    }
}
