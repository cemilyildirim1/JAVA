import java.util.Scanner;

public class MatrisleriCarpma {


    public void MatrisleriCarpma(){

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
        double [][] matrisCarpimi   = new double[satir1][sutun2];

        if (sutun1==satir2){
            for (int i=0;i<satir1 ;i++){
                for (int j=0;j<sutun1;j++){
                    System.out.println("Lütfen Matris1'in "+(i+1)+" inci satır ve "+(j+1)+" inci sütundaki elemanı yazınız");
                    matris1[i][j]=scanner.nextDouble();
                }
            }
            for (int i=0;i<satir2 ;i++){
                for (int j=0;j<sutun2;j++){
                    System.out.println("Lütfen Matri2'in "+(i+1)+" inci satır ve "+(j+1)+" inci sütundaki elemanı yazınız");

                    matris2[i][j]=scanner.nextDouble();

                }
            }
        }


        else {
            System.out.println("Matrisleri carpma isleminde, 1.Matrisin sütun sayısı 2.Matrisin satır sayısına eşit olmalıdır.");
            System.out.println("Lütfen tekrar deneyiniz");
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
        for (int i=0;i<satir2;i++){

            for (int j=0;j<sutun2;j++){
                System.out.print(matris2[i][j] + "\t");

            }
            System.out.println();
        }
        //matrislerin çarpılması:
        for(int i=0;i<sutun2;i++){
            for(int j=0;j<satir1;j++){
                matrisCarpimi[j][i]=0;
                for (int k=0;k<sutun1;k++){
                    matrisCarpimi[j][i]+=matris1[j][k]*matris2[k][i];
                }
            }
        }


        System.out.println("Matris Çarpımının Cevabı : ");
       for (int i=0;i<satir1;i++){
            for (int j=0;j<sutun2;j++){
                System.out.print(matrisCarpimi[i][j] + "\t");


            }
            System.out.println();
        }
    }
}
