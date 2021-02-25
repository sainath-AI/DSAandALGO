import java.util.Scanner;

public class vowelPriority {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases= scanner.nextInt();
        for(int i=0;i<testCases;i++){
            String givenString=scanner.next();
            String vowel="";
            String consonant="";
            for(int j=0;j<givenString.length();j++){
                if(givenString.charAt(j)=='a'||givenString.charAt(j)=='e'||givenString.charAt(j)=='i'||givenString.charAt(j)=='o'||givenString.charAt(j)=='u'){
                    vowel+=givenString.charAt(j);
                }else consonant+=givenString.charAt(j);
            }
            System.out.println(vowel+consonant);
        }
    }
}
