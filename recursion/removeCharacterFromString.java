package recursion;

public class removeCharacterFromString {

    static String remove(String str, int indx) {

        if (str.length() - 1 == indx) {
            return str;
        }
        if (str.indexOf("a") == indx) {
            str = str.substring(0, indx) + ""
                    + str.substring(indx + 1);
        }
        return remove(str, indx + 1);
    }
    static String removeString(String ch){

        if(ch.isEmpty()){
            return "";
        }
        char fchar=ch.charAt(0);
        if (ch.startsWith("nice")) {
            return removeString( ch.substring(4));
            
        }else{

            return fchar + removeString(ch.substring(1));
        }


    }

    public static void main(String[] args) {
        String str="sdaubaubauybuybaub";

        System.out.println(remove("sdaubaubauybuybaub",-1));
        System.out.println(str.substring(3, 6));
        System.out.println(removeString("xiubwuibniceiubib"));
        

    }

}
