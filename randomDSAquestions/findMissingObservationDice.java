package randomDSAquestions;

import java.util.Arrays;

public class findMissingObservationDice {

    static int[] observations(int[] rolls, int mean, int n) {
        int sum = 0;
        int[] arr = new int[n];
        int totalObs = (rolls.length + n) * mean;

        for (int i : rolls) {
            sum += i;
        }
        if (totalObs < n || totalObs > 6 * n) {
            return new int[] {};

        }

        int avg = totalObs - sum;
        int remAdd = avg % n;

        int defultNumber = avg / n;

        for (int i = 0; i < n; i++) {
            arr[i] = defultNumber;
            if (remAdd > 0) {
                arr[i]++;
                remAdd--;
            }

        }
        return arr;

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(observations(new int[] { 1, 5, 6 }, 3, 4)));

    }

}
