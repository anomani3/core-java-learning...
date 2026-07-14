package ashraf.DSAProblems;

public class TransposeMatrix {
    public static void main(String[] args) {
        int [][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Original matrix");
        for(int i=0;i<matrix[0].length;i++){
            for (int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" Transpose of matrix");
        for (int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
