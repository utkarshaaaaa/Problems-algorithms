package StacksQueue;

import java.util.Stack;

public class QueuesUsingStack {
  

    static public boolean add(int value,Stack<Integer> s1,Stack<Integer> s2){

        s1.add(value);
        return true;

    }
    static public int remove(Stack<Integer> s1,Stack<Integer> s2){

        int remove=s1.pop();
        s2.add(remove);
        int rem2=s2.pop();
        return rem2 ;


    }

    public static void main(String[] args) {
        Stack<Integer> s1= new Stack<>();
        Stack<Integer> s2= new Stack<>();

        add(12,s1,s2);
        add(11,s1,s2);
        add(90,s1,s2);
        add(23,s1,s2);

        System.out.println(remove(s1, s2));
        System.out.println(remove(s1, s2));
        System.out.println(remove(s1, s2));
        System.out.println(remove(s1, s2));


        



        

    }
    
}
