package ashraf.java8.programs;

public class Employee {
    private int id;
     private String name;
    private double salary;
    private String dept;
    private String gender;


    public Employee(int id,String name,double salary,String dept){

        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    public Employee(int id,String name,String gender){
        this .id=id;
        this.name=name;
        this .gender=gender;
    }
    public String getGender(){
        return gender;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return  name;
    }
    public  double getSalary(){
        return salary;
    }

    public String getDept(){
        return dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept=" +dept+ "gender= "+ gender+
                '}';
    }

}
