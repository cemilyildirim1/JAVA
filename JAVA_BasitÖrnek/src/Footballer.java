public class Footballer extends Player implements IPosition  {

    String mevki = "Orta Saha";
    public Footballer(String name, int age, String nationalTeam) {
        super(name, age, nationalTeam);
    }

    @Override
    public void setPosition() {

    }

    @Override
    public void playerInformation() {

    }

    public  void  setPosition(String yeniMevki){
        this.mevki = yeniMevki;
    }
}
