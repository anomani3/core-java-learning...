package ashraf.univesity_management;

import java.util.HashMap;
import java.util.Map;

public class UniversityService {

    private Map<Long,Student> students=new HashMap<>();


    public void addStudent(long id,String name){
        if(students.containsKey(id)){
            System.out.println("Student Already Exist");
            return;
        }
        students.put(id,new Student(id,name));
        System.out.println("Student Added successfully");
    }

    public void registerCourse(long studentId,String course){
        Student student=students.get(studentId);

        if(student==null){
            System.out.println("Student not Found");
            return;
        }
        student.getCourse().add(course);
        System.out.println("Course Registered");
    }

    public void displayCourse(long studentId){
        Student student= students.get(studentId);

        if(student==null){
            System.out.println("Student Not Found");
            return;
        }
        System.out.println(student.getCourse());
    }
}
