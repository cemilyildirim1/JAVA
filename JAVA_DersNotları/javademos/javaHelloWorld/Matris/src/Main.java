import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MatrisToplama2 toplama =new MatrisToplama2();
        MatrisCikartma cikartma=new MatrisCikartma();
        MatrisSabitSayiCarpma sabitSayiCarpma =new MatrisSabitSayiCarpma();
        MatrisleriCarpma matrisleriCarpma =new MatrisleriCarpma();
        MatrisDeterminant_3x3 determinant3x3 = new MatrisDeterminant_3x3();
        MatrisinTersiniAlma tersiniAlma = new MatrisinTersiniAlma();
        InvolitifMatrisHesaplama involitifMatrisHesaplama = new InvolitifMatrisHesaplama();


        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
        System.out.println("1-Matris toplaması yapmak ");
        System.out.println("2-Matris çıkartması  yapmak ");
        System.out.println("3-Matris ile sabit sayı çarpımı yapmak1");
        System.out.println("4-Matris çarpması yapmak");
        System.out.println("5-Matrisin determinantını bulma (3x3)");
        System.out.println("6-Matrisin tersini bulma (3x3)");
        System.out.println("7-Matrisin ivolitif olup olmadığına bakma");

        int a=scanner.nextInt();
        switch (a){
            case 1:
                toplama.MatrisToplama2();
                break;
            case 2:
                cikartma.MatrisCikartma();
                break;
            case 3:
                sabitSayiCarpma.MatrisSabitSayiCarpma();
                break;
            case 4:
                matrisleriCarpma.MatrisleriCarpma();
                break;
            case 5:
                determinant3x3.MatrisDeterminant_3x3();
                break;
            case 6:
                tersiniAlma.MatrisinTersiniAlma();
                break;
            case 7 :
                involitifMatrisHesaplama.InvolitifMatrisHesaplama();
                break;
            default:
                System.out.println("Seçenekler arasında olmayan bir sayı seçtiniz.Lütfen tekrar deneyiniz.");

        }















    }
}