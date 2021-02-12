import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N= s.nextInt();
        int [] arr= new int[N];
        for(int i=0; i<N;i++){
            arr[i]=s.nextInt();
        }
        for (int i=N-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }



}
