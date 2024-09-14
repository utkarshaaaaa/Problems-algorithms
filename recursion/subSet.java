package recursion;

import java.util.ArrayList;

public class subSet {
    static void sub(String s,String modified){
        if(s.isEmpty()){
            System.out.println(modified);
            return;
        }
        char a=s.charAt(0);
        sub(s.substring(1),modified + a);
        sub(s.substring(1), modified);
    }
    static ArrayList<String> retSub(String p,String up){
        if(up.length()==0){
            
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char f=up.charAt(0);
        ArrayList<String> left=retSub(p +f, up.substring(1));
        ArrayList<String> right=retSub(p, up.substring(1));

        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
        sub("aab","");

        System.out.println(retSub("", "aab"));


        
    }
    
}
