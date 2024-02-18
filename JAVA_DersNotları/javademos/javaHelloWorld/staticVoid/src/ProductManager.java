public class ProductManager {
    public void add(Product product){
        ProductVaidator validator = new ProductVaidator();
        if ( validator.isValid(product)){
            System.out.println("Eklendi");
        }
        else {
            System.out.println("Eklenemedi");
        }

    }
}
