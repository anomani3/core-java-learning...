package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.distinct;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PalindromeCheck {

    public static boolean canBePalindrome(String str) {

        // Step 1: Check if already a palindrome
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equals(reverse)) {
            return true;
        }

        // Step 2: Check if it can be rearranged into a palindrome
        long oddCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .values()
                .stream()
                .filter(count -> count % 2 != 0)
                .count();

        return oddCount <= 1;
    }

    public static void main(String[] args) {

        System.out.println(canBePalindrome("madam")); // true
        System.out.println(canBePalindrome("damma")); // true
        System.out.println(canBePalindrome("aabb"));  // true
        System.out.println(canBePalindrome("abc"));   // false
    }
}
