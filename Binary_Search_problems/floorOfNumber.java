package Binary_Search_problems;
//greatest number smaller or equal to the target number 

//condition  out of loop - end mid start
public class floorOfNumber {
    public static void main(String[] args) {

        int [] arr={2,3,5,9,14,16,18};

        System.out.println("Found number"+" "+ floor(arr, 14));

    }
    static int floor(int[] arr,int target){
        int start=0;
        int end=arr.length -1;


        while (start <= end) {
            int middle= start + (end -start)/2;

            if(arr[middle]==target){
                return middle;
            }

            if(target <arr[middle]){
                 end=middle -1;
               
                
            }else if(target > arr[middle]){
                 start=middle +1;
            }
            else{
                
                return middle;
            }
        
        }
        return arr[end];

        

    }
}
