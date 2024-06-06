package String;

public class Palindrom {

    public static void main(String[] args) {
        String a="abccba";
        boolean pal=false;

       for(int i=0;i<=a.length()/2;i++){
        char start=a.charAt(i);
        char end=a.charAt(a.length()-1-i);

        if(start==end){
           pal=true;
        }
        }

        if(pal){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }
        

        
    }
    
}
