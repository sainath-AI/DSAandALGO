import java.util.Scanner;

public class cyclicRotationOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        int temp = arr[N - 1];
        for (int i = N - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        for (int i = 0; i < N; i++)
            System.out.print(arr[i]);
    }
}

//System.arraycopy(arr, 0, arr, 1, N - 1);
//        arr[0] = temp;