import java.util.Scanner;

//Given a square matrix, turn it by 90 degrees in an
// anti-clockwise direction

public class RotateBy90 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[][] arr= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= s.nextInt();
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                System.out.print(arr[j][i] +" ");
            }
            System.out.println();
        }


    }

}
