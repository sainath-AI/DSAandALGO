package DSA450Questions;

import java.util.Scanner;

public class SumOfMaxSubArrayWithKadaneAlgo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int [] arr= new int[N];
        for (int i=0;i<N;i++){
            arr[i]=s.nextInt();
        }
        int maxSum=Integer.MIN_VALUE;
        int curSum=0;

        for (int i=0;i<N;i++){
            curSum+=arr[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        System.out.println(maxSum);

    }
}
