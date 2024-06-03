package Binary_Search_problems;

//smallest number in the array greater or equal to the target element in the array

public class ceilingOfNumber {
    public static void main(String[] args) {
        int [] arr={2,3,5,9,14,16,18};
        char[] letters={'c','f','j'};
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>4){
        //         System.out.println("it is the greater number"+ " "+arr[i]);
        //         break;
        //     }

        // }

        System.out.println("Found numeber"+" "+ celing(arr, 15));
        System.out.println("Found letter"+" "+ charCeling(letters, 'j'));

    }

    static int celing(int[] arr,int target){
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
        return arr[start];

        

    }

    static char charCeling(char[] arr,char target){
        int start=0;
        int end=arr.length;

        while (start<=end) {
            int middle= start + (end -start)/2;

            if(target > arr[middle]){
                start=middle +1;
            }else if(target<arr[middle]){
                end=middle-1;
            }else{
                return arr[middle];
            }

            
        }
        return arr[start];
    }
    

    
}
