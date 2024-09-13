package randomDSAquestions;

public class accentureInterview1 {
    static int minNumberOfHouses(int[] house,int rats,int unit){

        int foodAmount=rats*unit;
        int sum=0;
        int ans=0;

        for(int i =0;i<house.length;i++){
            sum = sum+house[i];
            if(sum>=foodAmount){
                ans= i+1;
                break;


            }
        }
        return ans;
       
        

    }

    static int test(int[] arr,int rats,int unit){
        int total= rats*unit;
        int j=0;
        int sum=0;

        while(j<arr.length){
            sum=sum+arr[j];

            if(sum>=total){
                return j +1;
            }
        
            j++;

        }
        return 0;


    }
    
    public static void main(String[] args) {  
        int[] arr=new int[]{2,8,3,9,7,4,1,2};
       
        

        System.out.println(minNumberOfHouses(arr, 7, 2));
        System.out.println(test(arr,7,2));
        
       
        
    }
    
}
