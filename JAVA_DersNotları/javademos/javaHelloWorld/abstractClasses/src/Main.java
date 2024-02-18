public class Main {
    public static void main(String[] args) {
        WomenGameCalculator womenGameCalculator=new WomenGameCalculator();
        womenGameCalculator.hesapla();
        womenGameCalculator.gameOver();

        GameCalculator gameCalculator=new GameCalculator() {
            @Override
            public void hesapla(){}
        };//veya
        GameCalculator womenGameCalculator2= new WomenGameCalculator();
        womenGameCalculator2.hesapla();



    }
}