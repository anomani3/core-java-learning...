package ashraf.java8.multithreading;

public class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        RunnableDemo r=new RunnableDemo();
        r.run();
    }
}

