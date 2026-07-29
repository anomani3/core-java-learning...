package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.reallifestudent_examples;

import java.util.Arrays;
import java.util.List;

public class StudentDemoQuestions {
    public static void main(String[] args) {

        List<Student> s= Arrays.asList(
                new Student(1,"Ashraf",500),
                new Student(2,"Arish",490),
                new Student(5, "Zaki", 450),
                new Student(6, "Rahul", 440),
                new Student(7, "Priya", 430),
                new Student(8, "Sneha", 420),
                new Student(9, "Rohit", 410),
                new Student(10, "Neha", 400),
                new Student(11, "Kiran", 390),
                new Student(12, "Pooja", 380),
                new Student(13, "Amit", 370),
                new Student(14, "Ramesh", 360),
                new Student(15, "Anjali", 350),
                new Student(16, "Suresh", 340),
                new Student(17, "Komal", 330),
                new Student(18, "Harish", 320),
                new Student(19, "Deepak", 310),
                new Student(20, "Meena", 300),
                new Student(21, "Ajay", 290),
                new Student(22, "Nisha", 280),
                new Student(23, "Vijay", 270),
                new Student(24, "Lavanya", 260),
                new Student(25, "Swathi", 250),
                new Student(26, "Bhavana", 240),
                new Student(27, "Naveen", 230),
                new Student(28, "Keerthi", 220),
                new Student(29, "Manoj", 210),
                new Student(30, "Divya", 200)
        );


        System.out.println("marks greater than == 580");

        s.stream()
                .filter(std->std.getMarks()>=220)
                .forEach(System.out::println);

        System.out.println("Students who passed like marks who obained 300 and more");

        s.stream()
                .filter(d->d.getMarks()>=300)
                .forEach(System.out::println);
        System.out.println("Student name starts with S");

        s.stream()
                .filter(d->d.getName().toLowerCase().startsWith("s"))
                .forEach(System.out::println);


        System.out.println("Students with marks between 200 and 300");

        s.stream()
                .filter(d->d.getMarks()>200 &&
                        d.getMarks()<300)
                .forEach(System.out::println);



    }
}
