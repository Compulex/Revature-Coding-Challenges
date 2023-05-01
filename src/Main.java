/**
 * 05-01-23
 * Create a function that takes numbers b and m as arguments and returns the derivative of the function
 * f(x)=x^b with respect to x evaluated at x=m, where b and m are constants.
 * Example
 *  derivative(1, 4) ➞ 1
 *  derivative(3, -2) ➞ 12
 *  derivative(4, -3) ➞ -108
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