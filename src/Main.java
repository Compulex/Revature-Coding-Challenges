/**
 * 05-01-23
 * There's a great war between the even and odd numbers. Many numbers already lost their lives in this war, and it's
 * your task to end this. You have to determine which group sums larger: the evens, or the odds. The larger group wins.
 * <p>
 * Create a function that takes an array of integers, sums the even and odd numbers separately, then returns the
 * difference between the sum of the even and odd numbers.
 * <p>
 * Examples
 * warOfNumbers([2, 8, 7, 5]) ➞ 2
 * // 2 + 8 = 10
 * // 7 + 5 = 12
 * // 12 is larger than 10
 * // So we return 12 - 10 = 2
 * warOfNumbers([12, 90, 75]) ➞ 27
 * warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168
 */

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