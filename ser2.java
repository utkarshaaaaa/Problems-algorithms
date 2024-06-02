import java.util.*;
public class ser2 {
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("start");
        
        for(int i=0;i<5;i++){
            System.out.println("enter "+ i+"number");
            int input=sc.nextInt();
            list.add(input);

        }
        System.out.println(list);

    }
}
