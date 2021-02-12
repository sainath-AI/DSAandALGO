//You are provided a string S. Write a program that returns length of the longest palindromic substring of
// that string.
import java.util.Scanner;

public class MasaiPAlindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String arr=scanner.next();
        int palindrome=0;
        for(int i=0;i<arr.length();i++){
            for(int j=i;j<arr.length();j++){
                String currentSum="";
                for(int k=i;k<=j;k++){
                    currentSum+=arr.charAt(k);
                }
                String p="";
                for(int check=currentSum.length()-1;check>=0;check--){
                    p+=currentSum.charAt(check);
                }
                if(currentSum.equals(p)){
                    if(currentSum.length()>palindrome){
                        palindrome=currentSum.length();
                    }
                }
            }
        }
        System.out.println(palindrome);
    }
}
