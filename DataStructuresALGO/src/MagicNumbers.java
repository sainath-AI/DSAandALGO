//You are given a numbern. A number is said to be magical if it contains magic digits 4
// and 7 only.For example 77,47,74,474 are magical and 5,467,17 are not

import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        if(N%4==0||N%7==0){
            System.out.println("YES");
        }
        else if(N==47||N==477){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }


}
