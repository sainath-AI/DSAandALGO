//Your friend sent you an encrypted message consisting of characters A, C, G and T only .
//      You know the decoded message is the longest repetition in the sequence. That is a maximum-length substring
//    containing only one kind of character. Can you decode it?


import java.util.Scanner;

public class DEcodeMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr = scanner.next();
        int max = Integer.MIN_VALUE;
        int a = 1;
        for (int j = 0; j < arr.length(); j++) {
            if (j > 0) {
                if (arr.charAt(j) != arr.charAt(j - 1)) {
                    a = 1;
                } else {
                    a++;
                }
            }
            if (a > max) {
                max = a;
            }
        }

        System.out.println(max);
    }


}

// i am sai
// sai am i