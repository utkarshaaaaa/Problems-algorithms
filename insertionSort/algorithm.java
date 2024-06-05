package insertionSort;
//swapping i and j index on the loop
//complexity o(n^2) worst case (array not sorted) in sorted array (best case) time Complexity O(n)
//Can be used when the array is sorted
//used for smaller value of n and when a array is partially sorted(hybrid sorting algorithm)

import java.util.Arrays;

public class algorithm {
    public static void main(String[] args) {
        int [] arr={1,23,2,45,11};

        incInsertion(arr);
        
        System.out.println(Arrays.toString(arr));
        decInsertion(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void incInsertion(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j =i+1;j>0;j--){
                if(arr[j] <arr[j-1]){

                    swap(arr,j,j-1);

                }else{
                    break;
                }
            }
        }

    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;



    }

    public static void decInsertion(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]>arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
}
