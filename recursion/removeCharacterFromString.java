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

    public static void main(String[] args) {
        String str="sdaubaubauybuybaub";

        System.out.println(remove("sdaubaubauybuybaub",-1));
        System.out.println(str.substring(3, 6));

    }

}
