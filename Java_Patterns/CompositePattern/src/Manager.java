public class Manager implements  Employee{
    String name;
    public Manager(String name ){
        this.name = name;
    }
    @Override
    public void showDetails() {
        System.out.println("Manager :" + name);
    }
}
