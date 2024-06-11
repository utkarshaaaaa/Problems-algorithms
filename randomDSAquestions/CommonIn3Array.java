package randomDSAquestions;
//Given an integer array of N elements. You need to find the maximum sum of two elements such that sum is closest to zero.

//Note: In Case if we have two of more ways to form sum of two elements closest to zero return the maximum sum.
public class CommonIn3Array {
    public static void main(String[] args) {

        int ar1[] = {1, 5, 10, 20, 40, 80} ;
        int ar2[] = {6, 7, 20, 80, 100} ;
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        common(ar1, ar2, ar3);
        
        
        
    }
    private static void common(int[] arr1,int[] arr2,int[] arr3){

        int[] temp=new int[10];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    
                    temp[j]=arr2[j];

                }
            }
        }

        for(int element:arr3){
            for(int element2:temp){
                if(element==element2){
                    System.out.println(element);
                }
            }
        }

        

    }
    
}
