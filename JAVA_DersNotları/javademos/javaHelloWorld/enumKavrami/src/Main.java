public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------\n< Java Enum Elemanlarını Ekrana Yazdırma >\n--------------------");
        for(carBrand c: carBrand.values()){
            System.out.println("-> Araba Markası: "+c.name()+"\t Ülke: ["+c.country+"]");
        }
        System.out.println("--------------------");



    }
        enum carBrand{
        AUDI("GERMANY"),
        DODGE ("ABD"),
        LAMBORGHINI ("ITALY"),
        BUGATTI ("FRANCE"),
        ROLLSROYCE ("ENGLAND");
        public String country;
        carBrand(String country){
            this.country = country;
        }
    }
}