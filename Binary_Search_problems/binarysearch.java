package Binary_Search_problems;

//used in sorted array

//worst case time comp = logN
//most probably used when given array is sorted
//dividing the given array in half till the target is found 

public class binarysearch {

    public static void main(String[] args) {
        int[] arr = { 0, 3, 5, 9, 12, 31 };

        System.out.println(" The index of the target " + BinarySearch(arr, 5));
        System.out.println(bsUsingRecurssion(arr, 0, arr.length - 1, 12));

    }

    static int bsUsingRecurssion(int[] arr, int start, int end, int target) {
        int middle = start + (end - start) / 2;
        if (arr[middle] == target) {
            return middle;
        }
        if (arr[middle] < target) {
            start = middle + 1;

        } else if (arr[middle] > target) {
            end = middle - 1;
        }
        return bsUsingRecurssion(arr, start, end, target);

    }

    

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (target < arr[middle]) {
                end = middle - 1;

            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {

                return middle;
            }

        }
        return -1;

    }

}
