//You are given a matrix(2 dimensional array) of integers of n rows and m columns. Your task is to
  //      write a program that calculates sum of all such integers present in the matrix which are divisible by 3.


import java.util.Scanner;

public class ConditionalMatrixSum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int[][] arr=new int[r][c];
        int sum=0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
                if(arr[i][j]%3==0){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }

}
