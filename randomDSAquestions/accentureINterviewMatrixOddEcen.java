package randomDSAquestions;

import java.util.Arrays;

public class accentureINterviewMatrixOddEcen {
    static void matrix(int[] mat) {
        int length = mat.length;
        int sum;
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

        int evenIndx = 0;
        int oddIndx = 0;
        int indx = 0;

        while (indx < length) {
            if (indx % 2 == 0) {
                even[evenIndx] = mat[indx];
                evenIndx++;
            } else {
                odd[oddIndx] = mat[indx];
                oddIndx++;
            }
            indx++;
        }

        System.out.println("Even numbers: " + Arrays.toString(even));
        System.out.println("Odd numbers: " + Arrays.toString(odd));
        Arrays.sort(even);
        Arrays.sort(odd);

        sum=even[even.length-2]+odd[odd.length-2];
        System.out.println("sorted array :"+Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
        System.out.println("sum of 2nd largest number: "+sum);

   
    }
    

    public static void main(String[] args) {
        int[] mat = new int[] { 3,4,1,7,9 };

        matrix(mat);
    }

}
