package randomDSAquestions;

import java.util.Arrays;

//Given an integer array of N elements. You need to find the maximum sum of two elements such that sum is closest to zero.
public class SumClosestToZero {

    public static void main(String[] args) {

        int[] arr={-21 -67 -37 -18 ,4 -65};
        System.out.println(sum(arr));
        
        
    }

    private static int sum(int[] arr){

        Arrays.sort(arr);
        int minSum=Integer.MAX_VALUE;
        int n=arr.length;

        int l=0;
        int r=n-1;

        while(l<r){
            int sum=arr[l] +arr[r];

            if(Math.abs(sum)<Math.abs(minSum)){
                minSum=sum;
            }

            if(sum>0){
                r--;

            }

            else if(sum<0){
                l++;
            }else{
                break;

            }

        }

        return arr[l] + arr[r];


    }
    
}
