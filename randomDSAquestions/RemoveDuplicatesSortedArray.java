package randomDSAquestions;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,2,2,3,3,3};
        dup(nums);
        
    }
    static void dup(int[] nums){
        int streakCount=1;
        int k=1;

        for (int i = 1; i < nums.length; i++) {

            if(nums[i]==nums[i+1]){
                
                streakCount++;



            }else{
                streakCount=1;
                
            }
            if(streakCount<=2){
                nums[k++]=nums[i];
                

            }

            System.out.println(k);

             
           
        }
     
    
            
    }
}
