import java.util.Scanner;

public class MatrisinTersiniAlma {

    public void MatrisinTersiniAlma(){//3x3 bir matrisin tersini alma.
        Scanner scanner=new Scanner(System.in);


        int satir=3;
        int sutun=3;
        double [][]matris = new double[satir][sutun];

        for (int i=0;i<satir ;i++){
            for (int j=0;j<sutun;j++){
                System.out.println("Lütfen Matris'in "+(i+1)+" inci satır ve "+(j+1)+" inci sütundaki elemanı yazınız");

                matris[i][j]=scanner.nextDouble();

            }
        }
        System.out.println("Matris  : ");
        for (int i=0;i<satir;i++){

            for (int j=0;j<sutun;j++){
                System.out.print(matris[i][j] + "\t");

            }
            System.out.println();
        }

        //matris devriğini buluyoruz.

        double [][] devrikmatris= new double[satir][sutun];

        devrikmatris[0][0] = matris[0][0];
        devrikmatris[1][0] = matris[0][1];
        devrikmatris[2][0] = matris[0][2];
        devrikmatris[0][1] = matris[1][0];
        devrikmatris[1][1] = matris[1][1];
        devrikmatris[2][1] = matris[1][2];
        devrikmatris[0][2] = matris[2][0];
        devrikmatris[1][2] = matris[2][1];
        devrikmatris[2][2] = matris[2][2];


        System.out.println("Matris'in Devriği : ");
        for (int i=0;i<satir;i++){
            for (int j=0;j<sutun;j++){
                System.out.print(devrikmatris[i][j] + "\t");
            }
            System.out.println();
        }

        //devriğini aldığımız matrisin minörünü bulucaz. devrikmatris in  minörü için DMM (DevrikMatrisMinör) kısaltmasını kullanıcaz.

        double [][] DMM= new double[satir][sutun];

        DMM[0][0]=(devrikmatris[1][1]*devrikmatris[2][2])-(devrikmatris[1][2]*devrikmatris[2][1]);
        DMM[0][1]=(devrikmatris[1][0]*devrikmatris[2][2])-(devrikmatris[1][2]*devrikmatris[2][0]);
        DMM[0][2]=(devrikmatris[1][0]*devrikmatris[2][1])-(devrikmatris[1][1]*devrikmatris[2][0]);
        DMM[1][0]=(devrikmatris[0][1]*devrikmatris[2][2])-(devrikmatris[0][2]*devrikmatris[2][1]);
        DMM[1][1]=(devrikmatris[0][0]*devrikmatris[2][2])-(devrikmatris[0][2]*devrikmatris[2][0]);
        DMM[1][2]=(devrikmatris[0][0]*devrikmatris[2][1])-(devrikmatris[0][1]*devrikmatris[2][0]);
        DMM[2][0]=(devrikmatris[0][1]*devrikmatris[1][2])-(devrikmatris[0][2]*devrikmatris[1][1]);
        DMM[2][1]=(devrikmatris[0][0]*devrikmatris[1][2])-(devrikmatris[0][2]*devrikmatris[1][0]);
        DMM[2][2]=(devrikmatris[0][0]*devrikmatris[1][1])-(devrikmatris[0][1]*devrikmatris[1][0]);



        System.out.println("Matris'in Devriği'nin Minörü : ");
        for (int i=0;i<satir;i++){
            for (int j=0;j<sutun;j++){
                System.out.print(DMM[i][j] + "\t");
            }
            System.out.println();
        }


        //şimdi kofaktör işlemi yapcıaz.

        double [][] kofaktorDMM= new double[satir][sutun];

        kofaktorDMM[0][0]=DMM[0][0];//+
        kofaktorDMM[0][1]=(-1)*DMM[0][1];//-
        kofaktorDMM[0][2]=DMM[0][2];//+
        kofaktorDMM[1][0]=(-1)*DMM[1][0];//-
        kofaktorDMM[1][1]=DMM[1][1];//+
        kofaktorDMM[1][2]=(-1)*DMM[1][2];//-
        kofaktorDMM[2][0]=DMM[2][0];//+
        kofaktorDMM[2][1]=(-1)*DMM[2][1];//-
        kofaktorDMM[2][2]=DMM[2][2];//+

        System.out.println("Matris'in Devriği'nin Minörü'ün Kofaktörü : ");
        for (int i=0;i<satir;i++){
            for (int j=0;j<sutun;j++){
                System.out.print(kofaktorDMM[i][j] + "\t");
            }
            System.out.println();
        }

        //son olarak determinantın çarpmaya göre tersi (1/determinant_değeri)ile kofaktörü çarpıp matrisimizin tersini bulucaz.
        double determinant=0;

        determinant+=matris[0][0]*matris[1][1]*matris[2][2];
        determinant+=matris[1][0]*matris[2][1]*matris[0][2];
        determinant+=matris[2][0]*matris[0][1]*matris[1][2];

        determinant-=matris[0][2]*matris[1][1]*matris[2][0];
        determinant-=matris[1][2]*matris[2][1]*matris[0][0];
        determinant-=matris[2][2]*matris[0][1]*matris[1][0];
        System.out.println("Determinantın cevabı : "+determinant);

        //determinantın çarpmaya göre tersini bir değere atıyoruz.
        double cevap[][]=new double[satir][sutun];

        double  sayi= 1/determinant;

        cevap[0][0]=kofaktorDMM[0][0]*sayi;
        cevap[0][1]=kofaktorDMM[0][1]*sayi;
        cevap[0][2]=kofaktorDMM[0][2]*sayi;
        cevap[1][0]=kofaktorDMM[1][0]*sayi;
        cevap[1][1]=kofaktorDMM[1][1]*sayi;
        cevap[1][2]=kofaktorDMM[1][2]*sayi;
        cevap[2][0]=kofaktorDMM[2][0]*sayi;
        cevap[2][1]=kofaktorDMM[2][1]*sayi;
        cevap[2][2]=kofaktorDMM[2][2]*sayi;

        System.out.println("Matris'in Devriği'nin Minörü'ün Kofaktör' ü  ve sonunda matrisin tersi: ");
        for (int i=0;i<satir;i++){
            for (int j=0;j<sutun;j++){
                System.out.print(cevap[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
