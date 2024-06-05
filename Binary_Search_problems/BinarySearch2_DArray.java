package Binary_Search_problems;
//time complexity O(n)

import java.util.Arrays;

public class BinarySearch2_DArray {
    public static void main(String[] args) {

        int[][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };

        System.out.println(""+ " "+Arrays.toString(rowcol(arr, 35)));       
    }
public static int[] rowcol(int[][] matirx,int target){

    int r=0;
    int col=matirx.length-1;

    while (r<matirx.length && col>0) {

        if(matirx[r][col]==target){
            return new int[] {r,col};
        }
        if(matirx[r][col] <target){
            r++;

        }else{
            col--;
        }
       
        
    }
    return new int[]{-1,-1};

}


}
