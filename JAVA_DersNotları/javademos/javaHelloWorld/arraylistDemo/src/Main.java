import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        //int array[] =new int[]{1,2,3};
        //System.out.println(array[1]);

        ArrayList sayilar =new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");

        //sayilar.remove(0);
        //System.out.println(sayilar.get(0));
        //sayilar.set(2,34);
        //System.out.println(sayilar.get(2));

        //sayilar.clear();
        //System.out.println(sayilar);
        for (Object x:sayilar){
            System.out.println(x);
        }

    }
}