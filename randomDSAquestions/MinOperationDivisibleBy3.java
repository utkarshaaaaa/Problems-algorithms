package randomDSAquestions;
import java.util.*;

public class MinOperationDivisibleBy3 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int arrlen=nums.length;
        System.out.println(div(nums, arrlen));

        
    }
    public static int div(int[] arr,int len){
        HashMap<Integer,Integer> num=new HashMap<>();
        int count=0;

        for(int i=0;i<len;i++){

            if(arr[i]%3==0){
                
            }else{
              count++;

            }
        }
        return count;

        

    }
    
}
