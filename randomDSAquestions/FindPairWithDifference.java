package randomDSAquestions;
import java.util.*;
public class FindPairWithDifference {

    public static void main(String[] args) {
        int[] givenArray= {5, 20, 3, 2, 50, 80,80,5,80};
        HashMap<Integer,Integer> h= new HashMap<>();
        int x=3;
         
        for (int index = 0; index < givenArray.length; index++) {

            if(!h.containsKey(givenArray[index])){
                h.put(givenArray[index], 1);
            }else{
                int prev=h.get(givenArray[index]);
                h.put(givenArray[index], prev +1);
            }

            if(h.get(givenArray[index]) >=x){
                
                 System.out.println(givenArray[index]);
            }
            
                 
        }

        

       

        
    }
    
}
