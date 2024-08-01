package oop;

//objects are stored in heap memory , reference variables are stored in stack memory
//variables inside object are known as instance variable
//new, dynamically alorts  -allocate the memory at the run time and returns a reference to it
//student stu1   =      new student();
// compile time        run time 
//when the memory is allocated while in run time is called dynamic memory allocation  
//comstructor define what happens when a object is created ,it is a special functions which runs when we allocate an object and it allocates 
//some variables

//"this" keyword 
 class Inneropps1 {
    int value;
    public Inneropps1(int val){
        this.value=val;


    }

    int[] Narr= new int[9];
    

    
}
public class opps1 {

   
    public static void main(String[] args) {
        

        Inneropps1 i=new Inneropps1(20);
        System.out.println(i.value);
         

    }


    
}
