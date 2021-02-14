package DSA450Questions;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.Scanner;
    public class HeightsofMinimumArray {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int K=scanner.nextInt();
            int N=scanner.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=scanner.nextInt();
            }
            System.out.println(Difference(K,N,arr));
        }

        private static int Difference(int k, int n, int[] arr) {
            for(int i=0;i<n;i++){
                if(arr[i]>k){
                    arr[i]-=k;
                }else{
                    arr[i]+=k;
                }
            }
            Arrays.sort(arr);

//            int min=arr[0];
//            int max=arr[0];
//            for(int i=1;i<n;i++){
//                if(max<arr[i]){
//                    max=arr[i];
//                }
//                if(min>arr[i]){
//                    min=arr[i];
//                }
//            }
            return Math.abs(arr[n-1]-arr[0]);
        }
    }

