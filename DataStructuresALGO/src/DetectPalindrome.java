//Given an integer, print "Yes" (without quotes) if that integer is aPalindrome, else print "No" (without quotes)

      //  You must not use the reverse() function. Using that would lead to disqualification

import java.util.Scanner;

public class DetectPalindrome {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int p=scanner.nextInt();
        System.out.println(PelindromeFunction(p));
    }
    public static String PelindromeFunction(int p){
        String empty="";
        int check=p;
        while(p>0){
            empty+=p%10;
            p/=10;
        }
        if(check==Integer.parseInt(empty)){
            return "Yes";
        }
        return "No";
    }
}
