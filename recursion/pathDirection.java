package recursion;

public class pathDirection {
    static void path(String p,int s,int e){
        if(s==1&& e==1){
            System.out.println(p);
            return;
        }
        if(s>1){
            path(p+'R', s-1, e);
        }
        if(e>1){
            path(p+'B', s, e-1);
        }

    }
    public static void main(String[] args) {
        path("", 3, 3);
        
    }
    
}
