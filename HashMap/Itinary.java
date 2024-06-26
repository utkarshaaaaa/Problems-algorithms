package HashMap;
import java.util.*;

public class Itinary {
    public static void main(String[] args) {
      HashMap<String,String> set=new HashMap<>();
      set.put("chennai", "bengaluru");
      set.put("mumbai", "delhi");
      set.put("goa", "chennai");
      set.put("delhi", "goa");
      iti(set, "mumbai", "bengaluru");

      
        
    }
    public static void iti(HashMap<String,String> map,String start,String end){
        String a=start;

        for(int i=0;i<map.keySet().size();i++){
           
            System.out.println(a);
            String current=map.get(a);
          
            a=map.get(current);
           
          

           
        }


      

    }
   
}
