

import java.util.Scanner;
public class HowMuchIsTheEarnig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int street = scanner.nextInt();
        int[] earn = new int[street];
        for (int n = 0; n < street; n++) {
            int N = scanner.nextInt();
            int R = scanner.nextInt();
            int count = 1;
            int[] h = new int[N];
            for (int j = 0; j < N; j++) {
                h[j] = scanner.nextInt();
            }
            int highest = h[0];
            for (int j = 1; j < N; j++) {
                if (highest < h[j]) {
                    highest = h[j];
                    count += 1;
                }
            }
            earn[n] = count * R;
        }
        for(int i=0;i<street;i++){
            System.out.println(earn[i]);
        }
    }
}
