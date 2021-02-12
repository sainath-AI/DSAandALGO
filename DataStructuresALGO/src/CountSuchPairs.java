//You are given an array A of N integers along with a
// target integer. Your task is to find out the number of pairs
// of integers present in the array whose sum is equal
// to the target value.

import java.util.Scanner;

public class CountSuchPairs {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int count=0;
        for(int i=0; i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==m){
                    count++;
                }
            }

        }
        System.out.println(count);

    }
}
