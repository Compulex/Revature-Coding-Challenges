package SecondMax;

/**
 * Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.
 * Input
 * First line contains the number of triples, N.
 * The next N lines which follow each have three space separated integers.
 * Output
 * For each of the N triples, output one new line which contains the second-maximum integer among the three.
 * Constraints
 * 1 ≤ N ≤ 6
 * 1 ≤ every integer ≤ 10000
 * The three integers in a single triplet are all distinct. That is, no two of them are equal.
 * Sample Input
 * 3
 * 1 2 3
 * 10 15 5
 * 100 999 500
 * Sample Output
 * 2
 * 10
 * 500
 */

import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        while(n > 0){
            int[] arr = new int[3];
            for(int i = 0; i < 3; i++){
                arr[i] = scan.nextInt();
            }
            System.out.println(secondMax(arr));
            n--;
        }
    }

    public static int secondMax(int[] arr){
        Arrays.sort(arr);
        return arr[1];
    }
}
