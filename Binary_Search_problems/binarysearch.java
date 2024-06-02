package Binary_Search_problems;

//used in sorted array
//worst case time comp = logN\
//dividing the given array in half till the target is found 

import java.util.Arrays;

public class binarysearch {

    public static void main(String[] args) {
        int[] arr={2,0,3,5,9,1,12,31,7};
        
        
        System.out.println(" The index of the target "+  BinarySearch(arr, 2));

    }

    static int BinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while (start <= end) {
            int middle= start + (end -start)/2;

            if(target <arr[middle]){
                 end=middle -1;
               
                
            }else if(target > arr[middle]){
                 start=middle +1;
            }
            else{
                
                return middle;
            }
        
        }
         return -1;
       
    }
    
}
