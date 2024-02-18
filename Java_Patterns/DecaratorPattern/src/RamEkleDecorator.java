public class RamEkleDecorator extends BilgisayarDecorator {
    public RamEkleDecorator(Bilgisayar bilgisayar){
        super(bilgisayar);
    }



    public double fiyat(){
        return super.fiyat() + 2500;
    }

    public String aciklama(){
        return super.aciklama() + "8 GB RAM eklendi....";
    }
}
