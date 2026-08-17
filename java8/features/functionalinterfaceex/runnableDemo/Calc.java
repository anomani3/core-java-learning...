package ashraf.java8.features.functionalinterfaceex.runnableDemo;

@FunctionalInterface
public interface Calc extends Calculator{
    public int addition(int a, int b);
}
