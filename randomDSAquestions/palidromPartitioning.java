package randomDSAquestions;
import java.util.*;

public class palidromPartitioning {
    static int n;

    static List<ArrayList<String>> Partitioning(String a){

        List<ArrayList<String>> lists= new  ArrayList<ArrayList<String>>();
        ArrayList<String> arr= new ArrayList<>();
        n=a.length();

        helper(lists,a,0,arr);

        return lists;           
           
    }
    static boolean isPalidrom(String s, int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
                

            }
            start++;
            end--;
        }
        return true;

    }
    static void helper(List<ArrayList<String>> lists,String a,int indx,ArrayList<String> arr){

        if(indx==n){
            lists.add(new ArrayList<>(arr));
            return;
        }
       
       



    


    }
   
    public static void main(String[] args) {
        // System.out.println(Partitioning("aab"));
        
       
       


        
    }
    
}
