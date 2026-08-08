package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.distinct;

import java.util.Arrays;
import java.util.List;

public class PrefixCa {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "category",
                "cattrep",
                "cat",
                "catskin",
                "case"
        );

        String prefix=list.stream()
                .reduce((s1, s2) -> {
                  int i=0;
                  while(i <s1.length() && i< s2.length()
                  && s1.charAt(i) == s2.charAt(i)){
                      i++;
                  }
                  return s1.substring(0,i);


                })
                .orElse(" ");

        System.out.println(prefix);


    }
}
