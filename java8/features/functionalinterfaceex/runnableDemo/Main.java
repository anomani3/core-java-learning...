package ashraf.java8.features.functionalinterfaceex.runnableDemo;

public class Main {
    public static void main(String[] args) {
        StringTransformer toUpper=i->i.toUpperCase();
        StringTransformer excite=i->i+"!!!@@@";

        System.out.println(toUpper.transform("hello Hi HELLO"));
        System.out.println(excite.transform("Hellllll"));
    }
}
