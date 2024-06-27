package HashMap;

import java.util.HashMap;

public class CountElementInArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 2, 4 };
        int len = arr.length;

        count(arr, len);

    }

    public static void count(int[] arr, int len) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] temp = new int[len];

        for (int i = 0; i < len; i++) {
            if (map.containsKey(arr[i])) {

                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }
        System.out.println(temp);

    }
}
