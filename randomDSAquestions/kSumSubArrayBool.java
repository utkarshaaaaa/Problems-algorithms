package randomDSAquestions;

import java.util.HashSet;
import java.util.Arrays;


//Logic
//sum of every iteration in the arr array and add it to the hashset 
//check if the item at the index at sumArr - k(total) exist in the sumList if yes return true
//note**
//HashSet is used when u hav eto traverse the list in constant time which reduces the TC
public class kSumSubArrayBool {

    static boolean findSubarraySum(int[] arr,int total){
        // int[] sumArr= new int[arr.length+1];
       HashSet<Integer> sumList=new HashSet<>();
        int sum=0;
        // sumArr[0]=0;
        sumList.add(0);
        

        for(int i=1;i<arr.length;i++){
            sum=sum+arr[i];
           
            int rem=sum -total;
            if(sumList.contains(rem)){
                return true;
            }
            sumList.add(sum);
        }
        return false;

        


    }
    public static void main(String[] args) {
        int[] list= new int[]{2,8,2,6,-6,3,2};
        System.out.println(findSubarraySum(list, 5) );
        
    }
    
}
