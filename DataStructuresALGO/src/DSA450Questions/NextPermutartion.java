package DSA450Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class NextPermutartion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        HashSet<Integer>hashSet=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        int diff=arr.length-hashSet.size();
        int matrixRaw=numberofPermutation();
        int [][]matrix=new int[n][n];
    }

    private static int numberofPermutation() {

        return 0;
    }
}
// 115 151 511
