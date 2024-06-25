package HashMap;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        count(nums, nums.length);

    }

    public static void count(int[] arr, int arrLen) {

        HashMap<Integer, Integer> store = new HashMap<>();

        for (int i = 0; i < arrLen; i++) {

            if (store.containsKey(arr[i])) {
                store.put(arr[i], store.get(arr[i]) + 1);
            } else {
                store.put(arr[i], 1);
            }

        }
        System.out.println(store);

    }

}
