import java.lang.reflect.Array;
import java.util.*;
public class old {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        wow(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void wow(int ...nums){
        nums[0]=99;
        
    }
    
   
    
}

