package randomDSAquestions;
import java.util.*;

import java.util.Comparator;

public class sortByStringLength {
    public static void main(String[] args) {
       
        ArrayList<String> ar= new ArrayList<>();
        ar.add("87");
        ar.add("98");
        ar.add("23");
        ar.add("95");

        Comparator<String> com= new Comparator<String>() {
            public int compare(String a,String b){
                String f=a+b;
                String s=b+a;
                return s.compareTo(f);

            }
        };
        Collections.sort(ar,com);
        System.out.println(ar);
    }
    
}
