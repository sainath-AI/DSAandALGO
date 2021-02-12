
import java.util.Arrays;
import java.util.Scanner;

public class sort012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i<N; i++) {
                arr[i] = s.nextInt();
        }

        Arrays.sort(arr);
        for (int j=0;j<N;j++) {
            System.out.print(arr[j] + " ");

        }


    }

}
