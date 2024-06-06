package String;

import java.util.ArrayList;

//Strings are immutable in java 
//same object can have different reference variables pointing to it
//String pool is used to optimize the code.
//examples =String a="abc" String b="abc" , they both are pointing to a single object and not two different objects 
//you can create a new object with that variable and the previous object will be removed(garbage collection)

public class strings {

    public static void main(String[] args) {

        String e="abc";
        String f="abc";
        String l=e;
        
        System.out.println(f==l);//true (pointed at same object in heap pool)
        
        
        //To create new object for the same value we use new key word{created in heap memory}

        String a= new String("abc");
        String b =new String("abc");
        

        if(a==b){
            System.out.println("They are having same object");
        }else{
            System.out.println("They are two different objects");
        }


        // To only check the value for the variable 

       
        System.out.println( a.equals(b));//true (comparing only values and not the object reference)
        System.out.println(a.charAt(0));

        System.out.println(new ArrayList<>());
        for(int i=0;i<26;i++){
            char ch=(char)('a'+ i);
            System.out.println(ch);

        }


    }
    
}
