import java.util.Scanner;

public class LargestSumoFSubArray2loops {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
       int [] sum = new int[N];
        sum[0]=arr[0];
        for (int i=1;i<N;i++){
            sum[i]=sum[i-1]+arr[i];
        }
        int max=Integer.MIN_VALUE;
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                int curSum=sum[j]-sum[i]+arr[i];
                if (curSum>max){
                    max=curSum;
                }
            }
        }
        System.out.println(max);
    }
}
