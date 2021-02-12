
//Given, an array A (index starting from 0) with N elements. You CAN remove only that element which makes the sum of ALL
// the remaining elements exactly divisible by 7.

import java.util.Scanner;

public class ApplyBasicMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int index = -1;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N - 1; i++) {

            if ((sum - arr[i]) % 7 == 0) {
                if (min > arr[i]) {
                    min = arr[i];
                    index = i;
                }
            }

        }
        if (index == -1) {
            System.out.println(index);
        } else {
            System.out.println(index);
        }
    }


}
