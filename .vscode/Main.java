 class Singleton{
 
    private static Singleton intance=null;
    private Singleton(){
    }
    public static Singleton getIntance(){

      if(intance==null)
      {
         intance=new Singleton();
      }
      return intance;
  
         
    }
    public static void print(){
System.out.println("Hello this is singleton class");
    }
}
 public class Main{
    public static void main(String[] args) {
        Singleton.getIntance().print();;;;;;;;;;;;

        System.out.println(Singleton.getIntance().hashCode());
        System.out.println(Singleton.getIntance().hashCode());
        System.out.println(Singleton.getIntance().hashCode());

        

        
    }

    
}