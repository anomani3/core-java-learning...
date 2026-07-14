package ashraf.java8.features.functionalinterfaceex.runnableDemo;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        //Takes no input
        //return one value

        Supplier<Double> random=()->Math.random();
        System.out.println(random.get());
        System.out.println(random.get());

        int otp=new Random().nextInt(66669999);
        System.out.println(otp);
    }

}
