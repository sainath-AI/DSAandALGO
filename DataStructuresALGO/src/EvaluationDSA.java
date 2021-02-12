import java.util.Scanner;

public class EvaluationDSA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        String[]arr = new String[testCases];
        for(int i=0;i<testCases;i++){
            arr[i]="";
        }
        for (int test = 0; test < testCases; test++) {
            int matrixSize = scanner.nextInt();
            int[][] matrix = new int[matrixSize][matrixSize];
            for (int i = 0; i < matrixSize; i++) {
                for (int j = 0; j < matrixSize; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < matrixSize; i++) {
                arr[test] += matrix[0][i];
            }
            for (int i = 1; i < matrixSize; i++) {
                arr[test] += matrix[i][matrixSize - 1 - i];
            }
            for (int i = 1; i < matrixSize; i++) {
             arr[test] +=matrix[matrixSize - 1][i];
            }
        }
        for (int i = 0; i < testCases; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                System.out.print(arr[i].charAt(j) + " ");
            }
            System.out.println();
        }
    }
}