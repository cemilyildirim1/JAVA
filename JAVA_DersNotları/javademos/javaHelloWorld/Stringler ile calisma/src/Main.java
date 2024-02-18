public class Main {
    public static void main(String[] args) {
        String mesaj = "Bu gün hava çok güneşli.";
       System.out.println(mesaj);
//
//        System.out.println("Eleman sayısı=" + mesaj.length());
//        System.out.println("5.Eleman=" + mesaj.charAt(4));
//        System.out.println(mesaj.concat("Terledim."));
//        String mesaj2=mesaj.concat("Terledim.");
//        System.out.println(mesaj2);
//        System.out.println(mesaj.startsWith("B"));
//        System.out.println(mesaj.endsWith("."));
//
//        char[] karakterler=new char[5];
//        mesaj.getChars(0,4,karakterler,0);
//        System.out.println(karakterler);
//        System.out.println(mesaj.indexOf("a"));
//        System.out.println(mesaj.lastIndexOf("a"));

//        System.out.println(mesaj.replace(" ","-"));
//        System.out.println(mesaj);
//        String yenimesaj=mesaj.replace(" ","-");
//        System.out.println(yenimesaj);
//        System.out.println(mesaj.substring(7,17));

        for (String kelimeler:mesaj.split(" ")){
            System.out.println(kelimeler);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        String mesaj2="    Bu gün hava çok güzel.       ";
        System.out.println(mesaj2.trim());

    }
}