package recursion;
import java.util.*;

public class combinationOfNumbersArray {

    static List<ArrayList<Integer>> find(int[] arr){
        List<ArrayList<Integer>> sol= new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> cur= new ArrayList<>();

        helper(arr,sol,cur,0);
        return sol;



    }
    static void helper(int[] arr,List<ArrayList<Integer>> sol,ArrayList<Integer> cur,int indx){
        if(indx==arr.length){
           sol.add(new ArrayList<>(cur));
           return;
        }
        cur.add(arr[indx]);
        helper(arr, sol, cur, indx +1);
        cur.remove(cur.size()-1);
        helper(arr, sol, cur, indx +1);

    }

    public static void main(String[] args) {
        int[] arr={2,3,4,1,4,5};
        System.out.println(find(arr));

        

    }
    
}
