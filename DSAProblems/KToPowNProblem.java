package ashraf.DSAProblems;

public class KToPowNProblem {
    public static int power(int k,int n){
        if(n==0){
            return 1;
        }
        return k*(power(k,n-1));
    }

    public static void main(String[] args) {
        int k=2;
        int n=5;
        System.out.println(power(k,n));
    }
}
