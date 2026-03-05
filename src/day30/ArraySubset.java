package day30;

import java.util.HashSet;

public class ArraySubset {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        boolean isSubset = true;

        for (int num : arr2) {
            if (!set.contains(num)) {
                isSubset = false;
                break;
            }
        }

        System.out.println("Is Subset? " + isSubset);
    }
}
