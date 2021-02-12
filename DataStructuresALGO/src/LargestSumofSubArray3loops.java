import java.util.Scanner;

public class LargestSumofSubArray3loops {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<N;i++){
            for (int j=i;j<N;j++){
                int cursum=0;
                for (int k=i;k<=j;k++){
                    cursum+=arr[k];
                }
                if(cursum>maxSum){
                    maxSum=cursum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
