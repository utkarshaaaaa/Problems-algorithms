package randomDSAquestions;

public class Missing_Repeating_No {

    public static void main(String[] args) {
        {
            int[] arr = { 7, 3, 4, 5, 5, 6, 2, 2 };
            int n = arr.length;
            repeating(arr, n);
        }

    }

    static void repeating(int[] arr, int n) {

        int[] temp = new int[n];
        int repeat = -1;

        for (int i = 0; i < arr.length; i++) {
            temp[arr[i] - 1]++;
            if (temp[arr[i] - 1] > 1) {
                repeat = arr[i];
                System.out.println(repeat);

            }

        }
        for (int j = 0; j < n; j++) {
            if (temp[j] == 0) {
                System.out.println(temp[j] + 1);
                break;
            }
        }

    }

}
