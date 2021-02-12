//Given a matrix with n rows and m columns. Print the matrix elements starting from the top
  //      right corner and follow a zig-zag pattern.
import java.util.Scanner;

public class GoinZigZag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int raw = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] mat = new int[raw][column];
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < raw; i++) {
            if (i % 2 == 0) {
                for (int j = mat[i].length - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int j = 0; j < mat[i].length; j++) {
                    if (i == raw - 1) {
                        if (j == 0) {
                            System.out.print(mat[i][j]);
                        } else {
                            System.out.print(" "+mat[i][j]);
                        }
                    }
                    else {
                        System.out.print(mat[i][j] + " ");
                    }
                }
            }
        }
    }
}
