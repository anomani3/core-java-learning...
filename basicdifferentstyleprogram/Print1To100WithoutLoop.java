package ashraf.basicdifferentstyleprogram;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Print1To100WithoutLoop {
    public static void main(String[] args) {

        //In two ways we can print
        //1 with the help of recursive fn
        //2 with the help of stream api
//printNum(1);
//
//printNum(1,100);

        IntStream.range(1,101)
                .forEach(e->System.out.println(e));



    }
    //        1 resursive method

    public  static void printNum(int n){

        if(n<=100){
            System.out.println(n);
            n++;
            printNum(n);

        }
    }

    public static void printNum(int fn,int ln){
        if(fn<=ln){
            System.out.println(fn);
            fn++;
            printNum(fn,ln);
        }

    }



}
