package HashMap;
import java.util.*;;

public class IntersecyionOfArray {
    public static void main(String[] args) {
        int[] arr1={2,7,11,15};
        int[] arr2={6,3,9,2,9,4};
        intersection(arr1, 13);
        
    }
    public static void intersection(int[] arr1,int target){

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
