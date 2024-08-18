package recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sunTriangleArray {
    static void Tsum(int[] arr){
        int[] temp= new int[arr.length-1];

        if(arr.length==1){
            return;
        }
        for(int i=0;i<arr.length-1;i++){
            temp[i]=arr[i]+arr[i+1];

        }
        System.out.println(Arrays.toString(temp));
       
        Tsum(temp);

    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        Tsum(arr);
    //    System.out.println(Arrays.toString(Tsum(arr)));
        
    }
    
}
