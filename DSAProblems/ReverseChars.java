package ashraf.DSAProblems;

import java.util.Arrays;

import static java.util.Collections.reverse;

public class ReverseChars {

    public static void reverse(char[] arr){
        int left=0;
        int right=arr.length -1;

        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }



    }
    public static void main(String[] args) {

        char[] arr = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("Before:");
        System.out.println(Arrays.toString(arr));

        reverse(arr);

        System.out.println("After:");
        System.out.println(Arrays.toString(arr));

    }
}
