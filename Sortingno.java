import java.util.Arrays;
import java.util.Scanner;
public class Sorting {
    public static void main(String args[]){
        System.out.print("Enter array limit: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.print("Enter array elements: ");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            SortColors.sortColors(a);
        }
    }
}

class SortColors{
    public static void sortColors(int nums[]){
        int n = nums.length;

        int z = 0, o = 0, t = 0;
        for(int i = 0; i < n; i++){
            switch (nums[i]) {
                case 0:
                    z++;
                    break;
                case 1:
                    o++;
                    break;
                case 2:
                    t++;
                    break;
                default:
                    break;
            }
        }
        int i;
        for (i = 0; i < z; i++){
            nums[i] = 0;
        }
        for(i = z; i < (o + z); i++){
            nums[i] = 1;
        }
        for(i = (o + z); i < (t + o + z); i++){
            nums[i] = 2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
