public class Developer implements Employee{
    String name;
    public Developer(String name){
        this.name = name;
    }

    public void showDetails(){
        System.out.println("Developrt :" + name);

    }
}
