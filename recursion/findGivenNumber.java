package recursion;

import java.util.ArrayList;

public class findGivenNumber {
    static ArrayList find(int[] arr, ArrayList<Integer> list, int target, int indx) {
        if (arr.length == indx) {
            return list;
        }
        if (arr[indx] == target) {
            list.add(indx);
        }
     

        return find(arr, list, target, indx + 1);

    }
    static ArrayList<Integer> insideFind(int[] arr,int target,int indx){

        ArrayList<Integer> temp= new ArrayList<>();
        if(arr.length==indx){
            return temp;
        }
        if(target==arr[indx]){
            temp.add(indx);
        }
        ArrayList<Integer> prevAns= insideFind(arr, target, indx +1);
        temp.addAll(prevAns);

        return temp;

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 4, 5, 46, 78,5 };
        ArrayList<Integer> temp = new ArrayList<>();
        System.out.println(find(a, temp, 5, 0));
        System.out.println(insideFind(a, 5, 0));

    }
    

}
