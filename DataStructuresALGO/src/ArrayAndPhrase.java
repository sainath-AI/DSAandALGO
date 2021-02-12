

         //You are given an array of n rows and m columns which contains lower case English letters. How many times does the phrase
  //      "saba" appear horizontally, vertically, and diagonally in the grid?

import java.util.Scanner;
public class ArrayAndPhrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfRaw = scanner.nextInt();
        int noOfColumn = scanner.nextInt();
        int count = 0;
        char[][] arr = new char[noOfRaw][noOfColumn];

        for (int i = 0; i < noOfRaw; i++) {
            String temp = scanner.next();
            arr[i] = temp.toCharArray();
        }
        for (int raw = 0; raw < noOfRaw; raw++) {
            for (int column = 0; column < noOfColumn; column++) {
                if ( raw<noOfRaw-3){
                    if(arr[raw][column]=='s'&& arr[raw+1][column]=='a'&& arr[raw+2][column]=='b' && arr[raw+3][column]=='a') {
                        count++;
                    }
                }
                if ( column<noOfColumn-3){
                    if(arr[raw][column]=='s' && arr[raw][column+1]=='a' && arr[raw][column+2]=='b' && arr[raw][column+3]=='a' ) {
                        count++;
                    }
                }
                if (raw<noOfRaw-3 && column<noOfColumn-3){
                    if(arr[raw][column]=='s' && arr[raw+1][column+1]=='a' && arr[raw+2][column+2]=='b' && arr[raw+3][column+3]=='a' ){
                        count++;
                    }
                }

                if (raw>=3 && column<noOfColumn-3) {
                    if(arr[raw][column]=='s' && arr[raw-1][column+1]=='a' && arr[raw-2][column+2]=='b' && arr[raw-3][column+3]=='a') {

                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
