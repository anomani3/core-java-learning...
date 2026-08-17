//package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.distinct;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class PrefixCa {
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList(
//                "category",
//                "cattrep",
//                "cat",
//                "catskin",
//                "catse"
//        );
//
//        String prefix=list.stream()
//                .reduce((s1, s2) -> {
//                  int i=0;
//                  while(i <s1.length() && i< s2.length()
//                  && s1.charAt(i) == s2.charAt(i)){
//                      i++;
//                  }
//                  return s1.substring(0,i);
//
//
//                })
//                .orElse(" ");
//
//        System.out.println(prefix);
//
//
//
//         int romanToInt(String s) {
//
//            Map<Character,Integer> map=new HashMap<>();
//
//            map.put('I', 1);
//            map.put('V', 5);
//            map.put('X', 10);
//            map.put('L', 50);
//            map.put('C', 100);
//            map.put('D', 500);
//            map.put('M', 1000);
//
//
//        }
//
//        int result=0;
//
//        for(int i = 0; i < s.length();i++){
//            int current=map.get(charAt(i));
//            if(i+1< s.length() && current < map.get(s.charAt(i+1))){
//                result -= current;
//
//            }
//            else{
//                result += current;
//
//
//    }
//
//
//}
