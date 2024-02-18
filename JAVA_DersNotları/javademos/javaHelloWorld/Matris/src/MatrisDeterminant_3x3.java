import java.util.Scanner;

public class MatrisDeterminant_3x3 {

    public void MatrisDeterminant_3x3(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 3x3 bir matris giriniz.");
        int satir = 3;
        int sutun = 3;

        double [][] matris =new double[satir][sutun];

        for (int i=0;i<satir ;i++){
            for (int j=0;j<sutun;j++){
                System.out.println("Lütfen Matris'in "+(i+1)+" inci satır ve "+(j+1)+" inci sütundaki elemanı yazınız");

                matris[i][j]=scanner.nextDouble();
            }
        }
        if (matris[0][0] ==0 && matris[0][1] ==0 && matris[0][2]==0){
            System.out.println("Determinanat almak için matriste satir veya sütunun elemanlarının tamamı 0 olamaz.");
            System.out.println("Lütfen tekrar deneyiniz.");
            return;
        }
        if (matris[1][0] ==0 && matris[1][1] ==0 && matris[1][2]==0){
            System.out.println("Determinanat almak için matriste satir veya sütunun elemanlarının tamamı 0 olamaz.");
            System.out.println("Lütfen tekrar deneyiniz.");
            return;
        }
        if (matris[2][0] ==0 && matris[2][1] ==0 && matris[2][2]==0){
            System.out.println("Determinanat almak için matriste satir veya sütunun elemanlarının tamamı 0 olamaz.");
            System.out.println("Lütfen tekrar deneyiniz.");
            return;
        }
        if (matris[0][0]==0 && matris[1][0] ==0 && matris[2][0]==0){
            System.out.println("Determinanat almak için matriste satir veya sütunun elemanlarının tamamı 0 olamaz.");
            System.out.println("Lütfen tekrar deneyiniz.");
            return;
        }
        if (matris[0][1] ==0 && matris[1][1] ==0 && matris[2][1]==0){
            System.out.println("Determinanat almak için matriste satir veya sütunun elemanlarının tamamı 0 olamaz.");
            System.out.println("Lütfen tekrar deneyiniz.");
            return;
        }
        if (matris[0][2] ==0.0 && matris[1][2] ==0.0 && matris[2][2]==0.0){
            System.out.println("Determinanat almak için matriste satir veya sütunun elemanlarının tamamı 0 olamaz.");
            System.out.println("Lütfen tekrar deneyiniz.");
            return;
        }
        System.out.println("Matris  : ");
        for (int i=0;i<satir;i++){

            for (int j=0;j<sutun;j++){
                System.out.print(matris[i][j] + "\t");

            }
            System.out.println();
        }
        double temp=0;


        //toplama işlemi:
          /*metod:a b c
                  d e f
                  g h m
                  a b c
                  d e f
        */





            temp+=matris[0][0]*matris[1][1]*matris[2][2];
            temp+=matris[1][0]*matris[2][1]*matris[0][2];
            temp+=matris[2][0]*matris[0][1]*matris[1][2];

            temp-=matris[0][2]*matris[1][1]*matris[2][0];
            temp-=matris[1][2]*matris[2][1]*matris[0][0];
            temp-=matris[2][2]*matris[0][1]*matris[1][0];



            System.out.println("Matris Determinantı : "+temp);









}
}
