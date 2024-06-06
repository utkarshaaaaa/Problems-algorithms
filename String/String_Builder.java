package String;

import java.util.Arrays;

public class String_Builder {
    public static void main(String[] args) {

        StringBuilder builder=new StringBuilder();
        //it is mutable and we can change the original object
        

        for(int i=0;i<26;i++){
            char ch=(char)('a'+ i);
            builder.append(ch);

        }
        System.out.println(builder.toString());

        String a="jhbjhb";
        System.out.println(Arrays.toString(a.toCharArray()));
    }
}
