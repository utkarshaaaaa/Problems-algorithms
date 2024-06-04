package Binary_Search_problems;

import java.util.Arrays;

public class firstAndLastPositionOfElement{

    public static void main(String[] args) {
        System.out.println("check");
        int[] arr={5,7,7,8,8,10};

        System.out.println(Arrays.toString(position(arr, 8)));
        
    }

    public  static int[] position(int[] arr,int target){

        int start=search(arr,target,true);

        int end=search(arr, target, false);
        int[] ans={-1,-1};

        ans[0]=start;
        ans[1]=end;

        return ans;     
    }

    public static int search(int [] nums,int target,boolean findIndex){

        int start=0;
        int end=nums.length-1;
        int ans=-1;

        while(end>=start){
            
            int middle= start + (end -start)/2; 

            if(target>nums[middle]){
                
                start=middle +1;
            }else if(target<nums[middle]){
                end=middle-1;
            }else{
                ans=middle;

                if(findIndex){
                    end=middle -1;

                }else{
                    start=middle +1;

                    
                }
            }
        }
        return ans;
       

    }

}