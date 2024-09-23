package randomDSAquestions;
import java.util.*;

import java.util.Comparator;

import String.strings;

public class sortByStringLength {
    static void sb(){
        StringBuilder a= new StringBuilder();
        a.append("01234");
        for( int i=0;i<a.length();i++){
            if(i%2!=0){
                a.deleteCharAt(i);
            }
        }
        System.out.println(a);

    }
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
        sb();

       
    }
    
}
