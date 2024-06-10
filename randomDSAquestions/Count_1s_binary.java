package randomDSAquestions;
public class Count_1s_binary {

    public static void main(String[] args) {
        int[] arr = { 7, 3, 4, 5, 5, 6, 2 };
        int n = arr.length;
        printTwoElements(arr, n);
    }
    static void printTwoElements(int[] arr, int n)
    {
        int[] temp
            = new int[n]; 
        int repeatingNumber = -1;
        int missingNumber = -1;

        for (int i = 0; i < n; i++) {
            temp[arr[i] - 1]++;
            if (temp[arr[i] - 1] > 1) {
                repeatingNumber = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (temp[i] == 0) {
                missingNumber = i + 1;
                
            }
        }

        System.out.println("The repeating number is "
                           + repeatingNumber + ".");
        System.out.println("The missing number is "
                           + missingNumber + ".");
    }
    
}
