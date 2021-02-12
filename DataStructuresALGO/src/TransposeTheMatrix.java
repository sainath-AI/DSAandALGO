//The transpose of a matrix is an operator which flips a matrix over its diagonal,
// that is it switches the row and column of the matrix by producing another matrix.

import java.util.Scanner;

public class TransposeTheMatrix {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int i,j;
        int row=s.nextInt();
        int col= s.nextInt();
        int[][] arr= new int[row][col];
        for (i=0;i<row;i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        for (i=0;i<col;i++){
            for (j=0;j<row;j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

    }
}
