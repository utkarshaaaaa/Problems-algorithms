package quickSort;

import java.util.Arrays;
import java.util.Random;
//n(logn)
//pivot as last element
//partitioning
//1 5 3 4 9 8    7--->pivot
//lp        rp
public class Quick_Sort {
    public static void main(String[] args) {
        
        Random rand=new Random();
        int[] nums=new int[10];

        for(int i=0;i<nums.length;i++){
            nums[i]=rand.nextInt(100);
        }

        System.out.println("Original array: ");
        System.out.println(Arrays.toString(nums));

        quickSort(nums, 0, nums.length-1);
        System.out.println("Sorted array:  " + Arrays.toString(nums));
        
    }

    private static void quickSort(int [] arr,int low,int high){

        if(low>= high){
            return;
        }

        int pivot=arr[high];
        int lp=low;
        int rp=high;

        while (lp <rp) {
            while (arr[lp] <=pivot && lp<rp) {
                lp++;
                
            }

            while (arr[rp] >= pivot && lp<rp) {
                rp--;
                
            }
            swap(arr, lp, rp);
            
        }
        swap(arr, lp, high);

        quickSort(arr, low, lp-1);
        quickSort(arr, lp+1, high);


    }

    private static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
