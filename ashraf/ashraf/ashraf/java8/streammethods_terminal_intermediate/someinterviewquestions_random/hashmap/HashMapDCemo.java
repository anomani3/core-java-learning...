package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.someinterviewquestions_random.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMapDCemo {
    public void characterFrequency(String s){
        Map<Character,Integer> map=new HashMap<>();
        for (char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);

        }
        System.out.println(map);
    }
    public void characterFrequencyUsingJAva8(String s8){
        Map<Character,Long> map=s8.chars()
                .mapToObj(c->Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        System.out.println(map);
    }
    public static void main(String[] args) {
        HashMapDCemo h=new HashMapDCemo();
        h.characterFrequency("Banana");
        h.characterFrequencyUsingJAva8("Bananab");

    }
}
