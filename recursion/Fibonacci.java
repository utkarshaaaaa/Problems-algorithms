package recursion;
//the last func is called  in recursion ,its known as tail recursion
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("sum"+fibo(6));
        
    }

    static int fibo(int n){

        if(n<2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);//not tail recursion 
    }
    
}
