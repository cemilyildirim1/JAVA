public class Main {
    public static void main(String[] args) {
        double[] mylist= {1.2, 1.3, 4.3, 5.6};
        double total=0;
        double max=mylist[0];
        for (double number:mylist){
            total=total+number;
            System.out.println(number);

        }
        System.out.println("toplam = "+total);

        for (int i=0;i<4;i++){
            if (max<mylist[i]){
                max=mylist[i];
            }
        }
        System.out.println("Bu listedeki en büyük sayı="+max);


    }
}