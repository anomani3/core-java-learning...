package ashraf.java8.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.stream;

public class MarksGreaterThan80 {

    public static void main(String[] args) {
        List<Student> lst= Arrays.asList(
                new Student(1,"Ashraf",90),
                new Student(2,"Kaju",80),
                new Student(3,"Raju22",80),
                new Student(4,"Ramu",70)
        );

        lst.stream()
                .filter(s->s.getScore()>=80)
                .forEach(System.out::println);


//        marks less than 80

        System.out.println("Students who have marks less than 80");
        lst.stream()
                .filter(s->s.getScore()<80)
                .forEach(System.out::println);


//        Students with Highest score

        System.out.println("Highest scoreer");

                lst.stream()
                .max(Comparator.comparing(Student::getScore))
                .ifPresent(System.out::println);
    }
}
