package recursion;
//While the function is not finished executing it will remain in stack
//main fnc is the first fnc to go in the stack (primitives are stored in stack memory)
//when a func is done executing it is removed from the stack and the flow of the program is restored to where the fnc is called

public class Recursion_bascis {

    public static void main(String[] args) {

        print1(0);
        

    }

    public static void print1(int a){

        a=a+1;
        System.out.println(a);

            print1(a);

        
       
        //don't start this 

    }
    
}
