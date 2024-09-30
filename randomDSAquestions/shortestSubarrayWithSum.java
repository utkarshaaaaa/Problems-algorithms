package randomDSAquestions;

public class shortestSubarrayWithSum {
    static void a(int[] arr,int n,int sum){
        int k=0;
        int i=0;
        int count=0;
        int minCount=9877;
        int msum=0;
        int j=1;
        while(j<arr.length){
            if(msum<sum){
                 msum=msum+arr[i] +arr[j];
                 count++;
                 
                 j++;
                
            }else{
                minCount=Math.min(minCount,count);
                msum=0;
                count=0;
                
            }
            
            
           
            
        }
        System.out.println(minCount+1);
       
        
    }
    public static void main(String[] args) {
        a(new int[]{1,4,45,6,0,19},6,51);
        
    }
    
}
