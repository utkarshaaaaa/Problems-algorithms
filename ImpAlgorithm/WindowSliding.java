package ImpAlgorithm;
//largest substring without repeating characters
public class WindowSliding {

    public static void main(String[] args) {
        st("");




        
    }
    static void st(String a){
        char[] ch = new char[a.length()];
 
        for (int i = 0; i < a.length(); i++) {
            ch[i] = a.charAt(i);
        }
 
       for(int i=0;i<a.length();i++){
         for(int j=i+1;j<a.length()-2;j++){
            if(ch[i]==ch[j]){
                System.out.println(ch[j]);
            }
         }
       }
    }
    
}
