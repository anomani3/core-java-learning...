package ashraf.java8.features.java17.sealedClassesFeature;

public class SumOfDiagonalsMatrix {
    public static void main(String[] args) {
//        1 2 3
//        2 3 4
//        3 4 5
//        exp output=1+3+5+3+3=15

        int [][] matrix={
                {1,2,3},
                {2,3,4},
                {3,4,6}
        };
        int primary=0;
        int secondry=0;
        int n=matrix.length;
        for (int i=0;i<n;i++){
            primary+=matrix[i][i];
            secondry+=matrix[i][n-1-i];

        }
        int total=primary+secondry;
        if (n%2==1){
            total-=matrix[n/2][n/2];
        }

        System.out.println(total);



    }
}
