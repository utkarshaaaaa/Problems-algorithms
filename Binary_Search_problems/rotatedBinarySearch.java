package Binary_Search_problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class rotatedBinarySearch {

    static int rBs(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int middle = low + (high - low) / 2;
        while (low <= high) {

            if (arr[middle] == target) {
                return middle;
            }
            if (arr[middle] >= arr[low]) {
                if (target <= arr[middle] && arr[low] <= target) {
                    high = middle - 1;

                } else {
                    low = middle + 1;
                }

            } else {
                if (arr[middle] <= target && target <= arr[high]) {
                    high = middle - 1;

                } else {
                    low = middle + 1;
                }
            }
            

        }
        return -1;

    }
    static int[] findSumForSortedArray(int[]arr,int target){
       int n=arr.length;
        int low=0;
        int high=n-1;
        while (low<=high) {
            int sum=arr[low]+ arr[high];
            if(sum==target){
                return new int[]{arr[low],arr[high]};
            }
            if(sum > target){
                low=low+1;
            }
            else{
                high=high-1;
            }
            
        }
        return new int[]{-1};

    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 1, 2, 3, 4 };
        System.out.println(Arrays.toString( findSumForSortedArray(arr, 10))  );
    }

} 
