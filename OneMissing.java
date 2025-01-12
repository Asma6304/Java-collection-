import java.util.Arrays;
import java.util.Scanner;
public class OneMissing {
    public static void main(String args[]){
        System.out.print("Enter array limit: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.print("Enter array elements: ");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Finding.oneMissing(a);
        }
    }
}

class Finding{
    public static void oneMissing(int nums[]){
        int n = nums.length;
        int[] a = new int[n + 1];
        Arrays.fill(a, 0);
        for ( int i = 0; i < n; i++){
                a[nums[i]]++;
        }
        for(int i = 1; i < n+1; i++){
            if(a[i] == 0){
                System.out.println("Missing: " + i);
            }
            else if(a[i] == 2){
                System.out.println("Repeating: " + a[i]);
            }
        }
    }
}
