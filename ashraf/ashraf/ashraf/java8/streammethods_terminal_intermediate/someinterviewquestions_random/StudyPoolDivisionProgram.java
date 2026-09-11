package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.someinterviewquestions_random;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudyPoolDivisionProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Division program with exception Handling");

        try{
            System.out.println("Enter the number to divide Numerator");
            double nemerator=sc.nextDouble();

            System.out.println("Enter Denominator");

            double denominator=sc.nextDouble();

            if (denominator==0){
                throw new ArithmeticException("Division By Zero Exception");
            }
            double res=nemerator/denominator;
            System.out.println(res);

        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input Input miss match error"+e.getMessage());

        }
        catch (Exception e){
            System.out.println("Unexpected error occured"+e.getMessage());

        }
        finally {
            //cleaning up resources

            sc.close();
            System.out.println("Program Execution completed");
        }

    }
}
