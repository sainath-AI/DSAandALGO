
//You are provided an integer N, print "Yes" (without quotes) if
  //      the given integer
    //    is prime, else print "No" (without quotes).

import java.util.Scanner;

public class IdentifyPrime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int temp;
        boolean isprime=true;
        int prime=s.nextInt();
        for(int i=2;i<=prime/2;i++) {
            temp = prime % i;
            if (temp == 0) {
                isprime = false;
                break;
            }
        }
        if(isprime)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}
