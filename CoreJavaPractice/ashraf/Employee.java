package ashraf;

public class Employee {
    String name;
    String dept;
    int Salary;


    public Employee(String name,String dept,int salary){
        this.name=name;
        this.Salary=salary;
                this.dept=dept;
    }
    public int getSalary() {
        return Salary;
    }
}
