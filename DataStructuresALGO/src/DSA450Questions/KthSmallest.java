package DSA450Questions;

import java.util.Arrays;
  import java.util.Scanner;

public class KthSmallest {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N= s.nextInt();
        int K = s.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(arr[K-1]);

    }
}
