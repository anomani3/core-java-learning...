package ashraf.univesity_management;

public class Main {
    public static void main(String[] args) {
            UniversityService service=new UniversityService();
        service.addStudent(101, "AShraf");
        service.registerCourse(101,"java programming");
        service.registerCourse(101, "C++");
        service.registerCourse(101,"DBMS");
        service.displayCourse(101);
    }
}
