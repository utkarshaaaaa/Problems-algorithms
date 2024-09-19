package randomDSAquestions;
import java.util.*;

import java.util.Comparator;

public class sortByStringLength {
    public static void main(String[] args) {
        String[] at= new String[]{"dedw","niiininxw","xwuyb","wnxxw","iubuqb","iu"};
        ArrayList<String> ar= new ArrayList<>();
        ar.add("dedw");
        ar.add("niiininxw");
        ar.add("xwuyb");
        ar.add("wnxxw");

        Comparator<String> com= new Comparator<String>() {
            public int compare(String a,String b){
                if(a.length()< b.length()){
                    return 1;
                }else{
                    return -1;
                }

            }
        };
        Collections.sort(ar,com);
        System.out.println(ar);
    }
    
}
