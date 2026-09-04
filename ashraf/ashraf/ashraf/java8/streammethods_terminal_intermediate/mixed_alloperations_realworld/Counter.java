package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.mixed_alloperations_realworld;

public class Counter {
    public static int count =0;



    Counter(){
        count++;
    }
    public static void main(String[] args) {
        Counter c=new Counter();
        Counter c1= new Counter();
        Counter c2=new Counter();
        System.out.println("Total count=: "+Counter.count);
        System.out.println(c1.hashCode());
        System.out.println(c.hashCode());
//        System.out.println(c2);

    }
}
