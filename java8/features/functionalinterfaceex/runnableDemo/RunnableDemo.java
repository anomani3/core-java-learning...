package ashraf.java8.features.functionalinterfaceex.runnableDemo;

public class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Running............");
    }

    public static void main(String[] args) {
//        RunnableDemo r=new RunnableDemo();
//        r.run();

    Runnable r1=()-> System.out.println("Running in lambda.........");
    Thread thread=new Thread(r1);
    thread.start();
        System.out.println("good check");

    }
}
