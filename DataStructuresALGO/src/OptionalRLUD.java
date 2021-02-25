import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;


public class OptionalRLUD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int Length = scanner.nextInt();
            String temp = scanner.next();
            if (Length % 2 == 0) {
                int[] count = new int[4];
                for (int k = 0; k <= 3; k++) {
                    count[k] = 0;
                }
                for (int j = 0; j < temp.length(); j++) {
                    //System.out.print(array[j]);
                    if (temp.charAt(j)=='D') {
                        count[0]++;
                    } else if(temp.charAt(j)=='U'){
                        count[1]++;
                    }
                    else if(temp.charAt(j)=='R'){
                        count[2]++;
                    }else if(temp.charAt(j)=='L'){
                        count[3]++;
                    }
                }

                if((count[0]==count[1])&&(count[2]==count[3])){
                    System.out.println("Yes");
                }else System.out.println("No");
            } else System.out.println("No");
        }
    }
}