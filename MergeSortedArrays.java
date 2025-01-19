import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    public static void mergeArrays(int[] ar1, int[] ar2) {
        int n = ar1.length;
        int m = ar2.length;
        int i = n - 1, j = 0;

        // Swap elements from end of ar1 and start of ar2 to maintain order
        while (i >= 0 && j < m) {
            if (ar1[i] > ar2[j]) {
                int temp = ar1[i];
                ar1[i] = ar2[j];
                ar2[j] = temp;
            }
            i--;
            j++;
        }

        // Sort both arrays after swapping
        Arrays.sort(ar1);
        Arrays.sort(ar2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first array
        System.out.print("Enter the number of elements in first array: ");
        int n = scanner.nextInt();
        int[] ar1 = new int[n];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n; i++) {
            ar1[i] = scanner.nextInt();
        }

        // Input for second array
        System.out.print("Enter the number of elements in second array: ");
        int m = scanner.nextInt();
        int[] ar2 = new int[m];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < m; i++) {
            ar2[i] = scanner.nextInt();
        }

        System.out.println("\nBefore merging:");
        System.out.println("ar1: " + Arrays.toString(ar1));
        System.out.println("ar2: " + Arrays.toString(ar2));

        mergeArrays(ar1, ar2);

        System.out.println("\nAfter merging:");
        System.out.println("ar1: " + Arrays.toString(ar1));
        System.out.println("ar2: " + Arrays.toString(ar2));

        scanner.close();
    }
}
