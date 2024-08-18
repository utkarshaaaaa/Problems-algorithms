package recursion;
//min max using recurssion

public class findMinAndMax {
    static int min(int[] arr,int indx,int min){

        if(arr.length-1==indx){
            return min;

        }
        if(arr[indx]<min){
            min=arr[indx];
        }
        return min(arr, indx+1, min);


    }
    static int max(int[] arr,int indx,int max){

        if(arr.length-1==indx){
            return max;

        }
        if(arr[indx] > max){
            max=arr[indx];
        }
        return max(arr, indx+1, max);


    }
    public static void main(String[] args) {
        int[] arr={34,56,12,89,65};
        System.out.println(min(arr, 0, Integer.MAX_VALUE));
        System.out.println(max(arr, 0, Integer.MIN_VALUE));

        
    }
    
}
