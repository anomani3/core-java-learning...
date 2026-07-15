package ashraf.java8.features;

@FunctionalInterface
public  interface Parent{
    void sayHello();
//    void sayBye();

    default void defaultDemo(){
        System.out.println("Hello this is defaut method");
    }
    static void demoStatic(){
        System.out.println("This is static demo method");
    }
}
