package org.ashraf.array;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInTwoArrays {
    public static Set<Integer> findCommmonElements(int array1[], int array2[]) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();
        //Add Elements of the first set to the array

        for (int num : array1) {
            set1.add(num);

        }
        // Check for common elements
        for (int num : array2) {
            if (set1.contains(num)) {
                commonSet.add(num);
            }
        }
        return commonSet;


    }
}

