package randomDSAquestions;

import java.util.Arrays;

public class chocolateDistribution {
    static void a(int[] arr,int n,int k){
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-k+1;i++){
            int mi=arr[i];
            int max=arr[i+k-1];
            min=Math.min(min,max-mi);
        }
        System.out.println(min);
        
    }
    public static void main(String[] args) {
        a(new int[]{23,45,12,34,67,4,31,42},8,5);
        
    }
    
}
