package ashraf.basicdifferentstyleprogram.pattern;

public class Pattern1 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print("1 ");
                }
                else

                    System.out.print("0 ");

            }
            System.out.println(" ");


        }
    }
}
