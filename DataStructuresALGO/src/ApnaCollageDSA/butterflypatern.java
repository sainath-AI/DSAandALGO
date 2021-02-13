package ApnaCollageDSA;

import java.util.Scanner;

public class butterflypatern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
                int space =2*n-2*i;
                for( int  j=0;j<space;j++ ) {
                    System.out.print(" ");
                }
                for (int  j=0;j<i;j++){
                    System.out.print("*");
                }
            System.out.println();
            }
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            int space =2*n-2*i;
            for( int  j=0;j<space;j++ ) {
                System.out.print(" ");
            }
            for (int  j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }
