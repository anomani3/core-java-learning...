package ashraf.DSAProblems;

public class KtoPowerNByRecursion {
     public static long power(long k, long n){
         if(n==0){
             return 1;
         }
         long half=power(k,n/2);
         if(n%2==0){
             return half*half;
         }
         return k*half*half;


     }

    public static void main(String[] args) {
        System.out.println(power(2,4));
    }

}
