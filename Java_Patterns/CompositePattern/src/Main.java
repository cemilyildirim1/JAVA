public class Main {
    public static void main(String[] args) {
        Developer developer1 = new Developer("cemil");
        Developer developer2 = new Developer("kağan");
        Manager manager = new Manager("Emirhan");

        Department department = new Department("yazılım gelişirme");

        department.addEmployee(developer1);
        department.addEmployee(developer2);
        department.addEmployee(manager);

        department.showDetails();
    }
}