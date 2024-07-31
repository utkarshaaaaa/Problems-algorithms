package oop;

//objects are stored in heap memory , reference variables are stored in stack memory
//variables inside object are known as instance variable
//new, dynamically alorts  -allocate the memory at the run time and returns a reference to it
//student stu1   =      new student();
// compile time        run time 
//when the memory is allocated while in run time is called dynamic memory allocation  

public class opps1 {

    public static class Inneropps1 {

        int[] Narr= new int[9];
        
    
        
    }
    public static void main(String[] args) {

        Inneropps1 i=new Inneropps1();
        i.Narr[0]=1;
        System.out.println(i.Narr.toString());
         

    }


    
}
