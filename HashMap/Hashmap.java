package HashMap;
import java.util.*;
//time complexity 0(1)
//key value pair
//internally as array of linked list 
//keys get into a hash function for giving output as the index of the array of linked list
//lambda =n(number of nodes)/N(number of buckets or the index in array) if it is equal or greater than the threshold then the bucket size is increased


import String.strings;

public class Hashmap {
    public static void main(String[] args) {
        int[] a={1,2};

        HashMap<Integer,String> ids=new HashMap<>();
        ids.put(1, "udv");
        System.out.println(ids.get(1));
        System.out.println(ids.size());
        
    }
    
}
