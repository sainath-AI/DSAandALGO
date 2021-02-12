//You are given an array A of N integers.
// Write a program to find the sum of the absolute difference
//   between all such pairs (A[i], A[j]) such that i < j and ( j-i ) is prime.


import java.util.Scanner;

public class SumofSpecialPairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int sum = 0;
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = s.nextInt();
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (prime(j - i)) {
                    sum = sum + Math.abs(array[i] - array[j]);
                }
            }
        }
        System.out.println(sum);
    }
    public static boolean prime(int m) {
        if (m <= 1) {
            return false;
        }
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }
}
