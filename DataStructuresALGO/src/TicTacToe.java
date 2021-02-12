
//You are given a 3*3 matrix (2-dimensional array) that represents the final situation of a Tic Tac Toe.

  //      Your task is to write a program that finds out the winner in case the match ended in a win. If the winner is 'x', print 'x'(without quotes).

    //    If the winner is 'o', print 'o' (without quotes)

      //  In case the match ended in a tie, print "Tie" (without quotes)

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = scanner.next();
        }
        System.out.println(check(arr));

    }

    private static String check(String[] given) {
        int p = 1;
        for (int i = 0; i < 9; i += 4) {
            if (!given[i].equals("x")) {
                p = 0;
                break;
            }
        }
        if (p == 1) {
            return "x";
        }
        for (int i = 0; i < 9; i += 4) {

            if (!given[i].equals("o")) {
                p = 0;
                break;
            } else {
                p = 1;
            }
        }
        if (p == 1) {
            return "o";
        }

        for (int i = 2; i <= 6; i += 2) {
            if (given[i].charAt(0) != 'x') {
                p = 0;
                break;
            } else {
                p = 1;
            }
        }
        if (p == 1) {
            return "x";
        }
        for (int i = 2; i <= 6; i += 2) {

            if (given[i].charAt(0) != 'o') {
                p = 0;
                break;
            } else {
                p = 1;
            }
        }
        if (p == 1) {
            return "o";
        }

        for (int j = 0; j <= 2; j++) {
            if (given[j].charAt(0) != 'x') {
                p = 0;
                break;
            } else {
                p = 1;
            }
        }
        if (p == 1) {
            return "x";
        }
        for (int j = 3; j <= 5; j++) {
            if (given[j].charAt(0) != 'x') {
                p = 0;
                break;
            } else {
                p = 1;
            }
        }
        if (p == 1) {
            return "x";
        }

        for (int j = 6; j <= 8; j++) {
            if (given[j].charAt(0) != 'x') {
                p = 0;
                break;
            } else {
                p = 1;
            }    }
        if (p == 1) {
            return "x";
        }

        for (int j = 0; j <= 2; j++) {
            if (given[j].charAt(0) != 'o') {
                p = 0;
                break;
            } else {
                p = 1;
            }   }
        if (p == 1) {
            return "o";
        }

        for (int j = 3; j <= 5; j++) {
            if (given[j].charAt(0) != 'o') {
                p = 0;
                break;
            } else {
                p = 1;
            }    }
        if (p == 1) {
            return "o";
        }

        for (
                int j = 6;
                j <= 8; j++) {
            if (given[j].charAt(0) != 'o') {
                p = 0;
                break;
            } else {
                p = 1;
            }    }
        if (p == 1) {
            return "o";
        }

        return "Tie";
    }
}
