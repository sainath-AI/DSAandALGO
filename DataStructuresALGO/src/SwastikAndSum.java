import java.util.Scanner;

//You are given a 2d array with n  rows and m columns where n and m are always odd. There are two different parts present in the 2d array and the sum
// of all the elements of the first part is referred as sum1 and that of the other is referred
  //      as sum2. You have to find the absolute difference between sum1 and sum2.

public class SwastikAndSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int noOfRaw = scanner.nextInt();
        int noOfColumn = scanner.nextInt();
        int sumFirstPath = 0;
        int sumSecondPath = 0;
        int[][] arr = new int[noOfRaw][noOfColumn];
        for (int i = 0; i < noOfRaw; i++) {
            for (int j = 0; j < noOfColumn; j++) {
                arr[i][j] = scanner.nextInt();
            }

        }
        for (int i = 0; i <noOfRaw/2; i++) {
            sumSecondPath+= arr[i][0];

        }
        for (int i = 0; i < noOfColumn; i++) {
            sumSecondPath+= arr[noOfRaw/2][i];
        }
        for (int i = (noOfRaw/2)+1; i <noOfRaw ; i++) {
            sumSecondPath+= arr[i][noOfColumn-1];
        }
        for (int i = 0; i <noOfColumn/2; i++) {
            sumFirstPath += arr[noOfRaw-1][i];

        }
        for (int i = noOfRaw-1; i >=0; i--) {
            sumFirstPath += arr[i][(noOfColumn/2)];
        }
        for (int i = noOfColumn/2+1; i <noOfColumn ; i++) {
            sumFirstPath += arr[0][i];
        }
        System.out.println(Math.abs(sumFirstPath-sumSecondPath));
    }
}
