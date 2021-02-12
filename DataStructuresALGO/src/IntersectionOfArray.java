//You are given 2 arrays of N integers. Your task is to
 //    write a program that finds
   //  the one integer which is common in both arrays.

import java.util.Scanner;

public class IntersectionOfArray {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr1=new int[N];
        int[] arr2=new int[N];
        for(int i=0;i<N;i++){
            arr1[i]=s.nextInt();
        }
        for(int j=0;j<N;j++){
            arr2[j]=s.nextInt();

        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }


    }
}
