package recursion;

import java.util.ArrayList;

public class findGivenNumber {
    static ArrayList find(int[] arr, ArrayList<Integer> list, int target, int indx) {
        if (arr.length == indx) {
            return list;
        }
        if (arr[indx] == target) {
            list.add(indx);
        }
     

        return find(arr, list, target, indx + 1);

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 4, 5, 46, 78,5 };
        ArrayList<Integer> temp = new ArrayList<>();
        System.out.println(find(a, temp, 5, 0));

    }

}
