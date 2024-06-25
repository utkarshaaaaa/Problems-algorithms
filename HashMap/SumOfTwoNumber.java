package HashMap;

import java.util.HashMap;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        int[] arr1={2,7,11,15};
       
        SumNumbers(arr1, 13);
        
    }
     public static void SumNumbers(int[] arr1,int target){

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr1.length;i++){

            int toTarget=target-arr1[i];

            map.put(toTarget, i);
           
            if(map.containsKey(toTarget)){
                System.out.println(arr1[map.get(toTarget)]);
                System.out.println(toTarget);
                break;
            }

          

        }
 


       
        
    }
    
    
}
