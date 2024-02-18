public class Main {
    public static void main(String[] args) {
        Gorev basitgorev = new BasitGorev("Simple Task");
        basitgorev.gorevAdi();
        System.out.println(basitgorev.gorevAdi());

        GelistirilmisGorev gelistirilmisGorev = new GelistirilmisGorev("Updated Task");

        Gorev adaptor = new GelistirilmisGorevAdaptor(gelistirilmisGorev);
        System.out.println(adaptor.gorevAdi());

    }
}