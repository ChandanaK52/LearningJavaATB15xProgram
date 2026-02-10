package CodingQuestions;

public class Employee {
    private int id;
    private double salary;

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

public static void main(){
    Employee e=new Employee();
    e.setId(1);
    e.setName("John Deo");
    e.setSalary(50000.0);
    System.out.print("Employee id:" + e.getId());
    System.out.print(" Employee name:"+ e.getName());
    System.out.print(" Employee Salary:"+ e.getSalary());





    }
}
