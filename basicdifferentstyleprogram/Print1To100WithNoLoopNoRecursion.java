package ashraf.basicdifferentstyleprogram;

import java.util.BitSet;

public class Print1To100WithNoLoopNoRecursion {
    public static void main(String[] args) {
      String set=  new BitSet() {{set(1,101);}}.toString();
        System.out.println(set);
System.out.append(set,1,set.length());
    }
}
