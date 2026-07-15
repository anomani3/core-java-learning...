package ashraf.DSAProblems;

import java.util.HashSet;
import java.util.Set;

public class DistinctArrayHashSet {
    public static void main(String[] args) {

        int [] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));

    }
    public static boolean containsDuplicate(int [] nums){
        Set<Integer> set=new HashSet<>();

        for(int num:nums){
            if (set.contains(nums)){
                return true;
            }
        }
        return false;

    }
    // this is the best approach time complexity  is O(n)
}
