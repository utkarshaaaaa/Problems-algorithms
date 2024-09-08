package recursion;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {

    static void sum(int[] candidates,int target,int indx, List<List<Integer>> res,ArrayList<Integer> cur){

        if(indx==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(cur));

            }
            return;
        }
        if(candidates[indx]<=target){
            cur.add(candidates[indx]);
            sum(candidates,target-candidates[indx],indx,res,cur);
            cur.remove(cur.size()-1);

        }
        sum(candidates,target,indx+1,res,cur);

    }


    public static  List<List<Integer>> combinations(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<List<Integer>>();
        ArrayList<Integer> cur= new ArrayList<Integer>();
        sum(candidates,target,0,res,cur);

        return res;

    }
   
    public static void main(String[] args) {
        int[] candidates={2,3,6,7};
        System.out.println(combinations(candidates, 7));
       
        
    }
   
    
}