
//Write a program that outputs the string representation of numbers from 1 ton.
//        But for multiples of 3 it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are
//        multiples of both three and five output “FizzBuzz”.

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = scanner.nextInt();
        }
        String output = "";
        for (int k = 0; k < t; k++) {
            for (int i = 1; i <= arr[k]; i++) {
                if ((i % 3) == 0 && (i % 5) == 0) {
                    output += "FizzBuzz ";
                } else if (i % 3 == 0) {
                    output += "Fizz ";
                } else if (i % 5 == 0) {
                    output += "Buzz ";
                } else {
                    output += i;
                    output +=" ";
                }

            }

        }
        String[]outpuString=output.split(" ");
        for (String s : outpuString) {
            System.out.println(s);
        }

    }
}