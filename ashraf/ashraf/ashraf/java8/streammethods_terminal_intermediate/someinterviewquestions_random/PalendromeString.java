package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.someinterviewquestions_random;

import java.sql.SQLOutput;

public class PalendromeString {
    public boolean isPalendromeString(String s){
        String rev="";
        for (int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);

        }
        if(s.equals(rev)){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isPalendromeInteger(int n){
        int original =n;
        int rev=0;

        while(n !=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;

        }
        return original==rev;
    }

    public void countDigit(int m){
        int count=0;
        while(m>0){
            m=m/10;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        PalendromeString p=new PalendromeString();
        System.out.println(p.isPalendromeString("madam"));
        System.out.println(p.isPalendromeInteger(121));

        p.countDigit(1234);


    }
}
