package oop;
//packages are the containers for the classes, they are folder
//static function does not need any object to execute

class n{
    public void dis(){
        System.out.println("diss");
    }
    public static void nDiss(){
        System.out.println("new diss");

    }
    public static void rev(String n){
        String c=" ";

        for(int i=0;i<n.length();i++){
            c=n.charAt(i) +c;
        }

        System.out.println(c);
    }
}
public class oop2 {
    public static void main(String[] args) {
        n s=new n();
        s.dis();
        n.nDiss();
        n.rev("hello");

        
    }
    
}
