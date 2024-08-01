package oop;

import String.strings;

//objects are stored in heap memory , reference variables are stored in stack memory
//variables inside object are known as instance variable
//new, dynamically alorts  -allocate the memory at the run time and returns a reference to it
//student stu1   =      new student();
// compile time        run time 
//when the memory is allocated while in run time is called dynamic memory allocation  
//comstructor define what happens when a object is created ,it is a special functions which runs when we allocate an object and it allocates 
//some variables

//"this" keyword 
//primitives are not objects they are stored in stack memory(Boolean, char, byte, int, short, long, float, and double )
//"final " keyword cannot be changed (constant value) and it should be initialized while declaring it (it should be premitive type)
//if it is not premitive , we can change the value vut cannit reassign it
//Finalize method will be called whe the java is doing garbage colllection
 class Inneropps1 {
    int value;
    String name;
    public Inneropps1(int val,String name){
        this.value=val;
        this.name=name;


    }
    public Inneropps1(int val){
        this.value=val;


    }

    public Inneropps1(Inneropps1 other){
        this.value=other.value;

    }

    int[] Narr= new int[9];
    

    
}
public class opps1 {

   
    public static void main(String[] args) {
        

        Inneropps1 i=new Inneropps1(10);
        Inneropps1 n=new Inneropps1(21);
        Inneropps1 j=n;
        n.value=12;
        System.out.println(j.value);


         

    }


    
}
