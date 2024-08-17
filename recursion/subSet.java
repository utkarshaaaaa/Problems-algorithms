package recursion;

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
    public static void main(String[] args) {
        sub("abcd","");


        
    }
    
}
