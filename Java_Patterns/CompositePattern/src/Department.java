import java.util.ArrayList;

public class Department implements Employee{
    String name;
    private ArrayList<Employee> employees = new ArrayList<>();

   public Department(String name){
        this.name = name;
    }
    public void addEmployee(Employee employee){
       employees.add(employee);
    }

    public void showDetails(){
        System.out.println("Department : " + name);
        System.out.println(name + "da çalışan insanlar");
        for(Employee employee : employees){
            employee.showDetails();
        }

    }
}
