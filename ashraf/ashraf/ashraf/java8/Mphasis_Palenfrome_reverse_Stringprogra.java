package ashraf.ashraf.ashraf.ashraf.java8;

public class Mphasis_Palenfrome_reverse_Stringprogra {
    public static void main(String[] args) {
        String s="masam";
        String reversed="";

        for(int i=s.length()-1;i>=0;i--){
         char   ch=s.charAt(i);
            reversed = reversed+ch;

        }
        System.out.println(reversed);
        String PalendromeChar="";

        if(s.equals(reversed)){
            System.out.println("Palendrome String");
        }
        else{
            System.out.println("Not palendrome String");
        }
    }
}
