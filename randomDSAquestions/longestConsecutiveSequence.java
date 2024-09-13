package randomDSAquestions;

import java.util.Arrays;

public class longestConsecutiveSequence {

    static int consecutiveCheck(int[] a){
        Arrays.sort(a);
        
        int length=0;

        int tempMax=1;
        if(a.length==1){
            return 1;
        }
        
        

       for(int i=0;i<a.length-1;i++){

        if(a[i+1]-a[i]==0){
            return 1;
        }
            if(a[i+1]-a[i]==1){
                tempMax++;
                length= Math.max(length, tempMax);             
            }else{
                tempMax=1;
            }

        }
        return length;
    }

    public static void main(String[] args) {

        int[] a=new int[]{0,0,0,0,0,0,0};
        System.out.println(consecutiveCheck(a));


        
    }
    
}
