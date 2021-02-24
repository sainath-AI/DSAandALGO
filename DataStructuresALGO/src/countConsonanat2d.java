import java.util.Scanner;

public class countConsonanat2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = Integer.parseInt(scanner.nextLine());
        int[] output = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            int raw = Integer.parseInt(scanner.nextLine());
            int column = Integer.parseInt(scanner.nextLine());
            char[][] arr = new char[raw][column];
            for (int j = 0; j < raw; j++) {
                String temp = scanner.nextLine();
                int p = 0;
                for (int k = 0; k < column; k++) {
                    arr[j][k] = temp.charAt(k + p);
                    p++;
                }
            }

            int count = 0;
            int k=0;
            if (column % 2 == 1) {
                for (int j = 0; j < ((raw / 2) + 1); j++) {
                    for ( k = column - 1; k >= 0; k--) {
                        if (arr[j][k] != 'a' || arr[j][k] != 'e' || arr[j][k] != 'i' || arr[j][k] != 'o' || arr[j][k] != 'u') {
                            count++;

                        }
                        break;
                    }
                }
                for(int j=((raw/2)+1);j<raw;j++){
                    for(k=0;k<column;k++){
                        if (arr[j][k] != 'a' || arr[j][k] != 'e' || arr[j][k] != 'i' || arr[j][k] != 'o' || arr[j][k] != 'u') {
                            count++;
                            break;
                        }


                    }
                }
                output[i]=count;
            }else{
                System.out.println(-1);
                output[i]=-1;
            }
        }
        for(int i=0;i<testCase;i++){
            System.out.println(output[i]);
        }
    }
}

