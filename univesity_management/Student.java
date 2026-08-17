package ashraf.univesity_management;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private long studentID;
    private String studentName;
    private Set<String> course;

    public long getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public Set<String> getCourse() {
        return course;
    }

    public Student(long studentID, String studentName) {
        this.studentID = studentID;
        this.studentName=studentName;
        this.course=new HashSet<>();
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourse(Set<String> course) {
        this.course = course;
    }


}
