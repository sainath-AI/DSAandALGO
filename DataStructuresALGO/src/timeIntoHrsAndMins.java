import java.util.Scanner;

public class timeIntoHrsAndMins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int h=n/60;
        int t=n%60;
        if(h==1){
            System.out.println(h+"hr "  + t +"mins");
        }
        else if(t==0){
            System.out.println(h+"hrs " + "00");
        }
        else
            System.out.println(h+"hrs " + t+"mins");
    }
}
