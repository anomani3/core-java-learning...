package ashraf.java8.features.functionalinterfaceex.runnableDemo;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<String,Integer> length=
                str->str.length();
        System.out.println(length.apply("Ashraf"));

        UnaryOperator<Long> cude=
                n->n*n*n;
        System.out.println(cude.apply(10000000L));

//        BinaryOperator

        BinaryOperator<Integer> sum=
                (a,b)->a+b;
        System.out.println(sum.apply(20,30));
    }
}
