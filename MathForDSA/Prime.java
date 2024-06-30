package MathForDSA;


//n(logN)
public class Prime {
    public static void main(String[] args) {
    

        

    }
    public static void prime(int n,boolean[] primes){

        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for (int j = i*2; j <=n; j++) {
                    primes[j]=true;
                    
                }
            }
        }

        for (int i = 0; i <=n; i++) {

            if(!primes[i]){
                System.out.println(i);
            }

            
        }
        
    }
  
    
}
