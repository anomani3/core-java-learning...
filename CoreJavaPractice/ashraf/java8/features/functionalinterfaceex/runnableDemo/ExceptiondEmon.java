package ashraf.java8.features.functionalinterfaceex.runnableDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExceptiondEmon {

  static  double a=15;
   static double b=7;

    public static void main(String[] args) {
   try{
       double result=a/b;
       System.out.println(result);
   }catch (Exception e){
       e.printStackTrace();
   }

        List<String> lst= Arrays.asList("Hi","Bye","Good Bye");
        String longest=lst.stream()
                .max(Comparator.comparing(String::length))
                .orElse("");
        System.out.println("Longest:    "+longest);


    }
}
