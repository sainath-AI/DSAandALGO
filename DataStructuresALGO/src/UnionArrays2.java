

import java.util.Scanner;
public class UnionArrays2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int N=scanner.nextInt();
        int  M=scanner.nextInt();
        int []A=new int[N];
        int []B=new int[M];

        int K=N;
        int []C=new int[K];

        for(int i=0;i<N;i++){
            A[i]=scanner.nextInt();
            C[i]=A[i];
        }
        for(int i=0;i<M;i++){
            B[i]=scanner.nextInt();
            boolean check=true;
            for(int j=0;j<K;j++){
                if(C[j]==B[i]){
                    check=false;
                    break;
                }
            }
            if(check){
                K+=1;
                C[K]=B[i];
            }
        }
        System.out.println(C.length);
    }
}
