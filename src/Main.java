import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = warOfNumbers(new int[]{2, 8, 7, 5});
        System.out.println(a);

        int b = warOfNumbers(new int[]{12, 90, 75});
        System.out.println(b);

        int c = warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243});
        System.out.println(c);
    }

    public static int warOfNumbers(int[] arr){
        int sum_even = 0, sum_odd = 0;

        for (int j : arr) {
            if (j % 2 == 0) {
                sum_even += j;
            } else {
                sum_odd += j;
            }
        }

        return Math.abs(sum_even - sum_odd);
    }
}