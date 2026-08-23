package ashraf.DSAProblems;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {


            int[] arr = {0, 1, 0, 3, 12};

            System.out.println("Before:");
            System.out.println(Arrays.toString(arr));

            moveZeros(arr);

            System.out.println("After:");
            System.out.println(Arrays.toString(arr));
        }

    private static void moveZeros(int[] arr) {


        int index = 0;

        // Put all non-zero elements at the beginning
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }
    }

