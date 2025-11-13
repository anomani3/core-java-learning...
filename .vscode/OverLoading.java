import javax.print.DocFlavor.STRING;

public class OverLoading {
    void m1(int s){
        System.out.println("sring");

    }
    void m1(Object o){
        System.out.println("Objec");

    }

    public static void main(String[] args) {
        OverLoading obj=new OverLoading();
         obj.m1("Hello");

        
    }
    
}
