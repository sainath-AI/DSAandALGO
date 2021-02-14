package DSA450Questions;

import java.util.HashSet;
import java.util.Scanner;

public class unionofArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        int M=scanner.nextInt();
        int[]A=new int[N];
        int [] B= new int[M];
        HashSet<Integer> hashSet= new HashSet<>();
        for(int i=0;i<N;i++){
            A[i]=scanner.nextInt() ;
            hashSet.remove(A[i]);
        }
        for(int i=0;i<M;i++){
            B[i]=scanner.nextInt();
            hashSet.remove(B[i]);
        }
        System.out.println(hashSet.size());
    }
}
