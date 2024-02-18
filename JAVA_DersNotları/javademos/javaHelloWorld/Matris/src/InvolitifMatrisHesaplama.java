import java.util.Scanner;
public class InvolitifMatrisHesaplama {

    public void InvolitifMatrisHesaplama(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sadece kare matrislerin involitifliği hesaplanabilir.");
        System.out.println("Lütfen bir matris giriniz.Girdiğiniz matris bir kare matris olsun.");

        System.out.println("Lütfen Matris'in satır ve sütun bilgisini giriniz.");
        System.out.println("Lütfen Matris'in satır bilgisini giriniz.");
        int satir = scanner.nextInt();
        System.out.println("Lütfen Matris'in Sütun bilgisini giriniz.");
        int sutun =scanner.nextInt();


        if (satir!=sutun){
            System.out.println("Girdiğiniz matris bir kare matris değildir.Lütfen tekrar deneyiniz.");
            return;
        }

        double [][] matris =new double[satir][sutun];
        double [][] matrisCarpimi =new double[satir][sutun];
        int [][] birimMatris =new int[satir][sutun];

        //birim matris :

        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                if(i==j){
                    birimMatris[i][j]=1;
                }
                else {
                    birimMatris[i][j]=0;
                }

            }
        }

        for (int i=0;i<satir ;i++){
            for (int j=0;j<sutun;j++){
                System.out.println("Lütfen Matris'in "+(i+1)+" inci satır ve "+(j+1)+" inci sütundaki elemanı yazınız");

                matris[i][j]=scanner.nextDouble();
            }
        }
        
        System.out.println("Birim Matris  : ");
        for (int i=0;i<satir;i++){
            for (int j=0;j<sutun;j++){
                System.out.print(birimMatris[i][j] + "\t");

            }
            System.out.println();
        }


        System.out.println("Matris  : ");
        for (int i=0;i<satir;i++){

            for (int j=0;j<sutun;j++){
                System.out.print(matris[i][j] + "\t");

            }
            System.out.println();
        }


        //matrislerin karesinin alınması:

        for(int i=0;i<sutun;i++){
            for(int j=0;j<satir;j++){
                matrisCarpimi[j][i]=0;
                for (int k=0;k<sutun;k++){
                    matrisCarpimi[j][i]+=matris[j][k]*matris[k][i];
                }
            }
        }



        System.out.println("Matrisin karesinin cevabı : ");
        for (int i=0;i<satir;i++){

            for (int j=0;j<sutun;j++){
                System.out.print(matrisCarpimi[i][j] + "\t");

            }
            System.out.println();
        }



        //Matrisin karesinin birim matrise eşitliğinin sorgusu :
        int temp=0;
        for (int i=0;i<satir;i++){

            for (int j=0;j<sutun;j++){
                if (matrisCarpimi[i][j]==birimMatris[i][j]){
                    temp+=1;
                }
            }
            System.out.println();
        }




        System.out.println("Bir matrisin karasenin cevabı eğer bir birim matrise eşit ise o matris bir involitif matristir.");

        if (temp==satir*sutun){
            System.out.println("Girdiğiniz matris bir involitif matristir.");
        }
        else {
            System.out.println("Girdiğiniz matris bir involitif matris DEĞİLDİR.");
        }



    }
}
