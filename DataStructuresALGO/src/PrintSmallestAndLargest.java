// Given an array, A, of N integers, print the smallest and largest element present in the array

import java.util.Scanner;

public class PrintSmallestAndLargest {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int min=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(n==1){
                min=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
