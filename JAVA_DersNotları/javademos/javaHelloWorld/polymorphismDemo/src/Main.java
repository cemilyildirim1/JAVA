public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers=new BaseLogger[]{new EmailLogger(),new FileLogger(),new DatabaseLogger(),new ConsoleLogger()};
//        for (BaseLogger logger :loggers){
//            logger.Log("Log mesajı");    }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();








    }
}