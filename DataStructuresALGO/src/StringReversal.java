import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1=scanner.nextLine();
        String [] string2=string1.split(" ");
        for(int i=string2.length-1;i>=0;i--){
            System.out.print(string2[i]+" ");
        }
    }
}
