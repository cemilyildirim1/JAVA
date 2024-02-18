public class BalanceInsufficentException extends Exception{
    String massage;

    public BalanceInsufficentException(String massage){
        this.massage=massage;
    }

    @Override
    public String getMessage() {
        return massage;
    }
}