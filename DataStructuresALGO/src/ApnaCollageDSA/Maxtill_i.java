package ApnaCollageDSA;

import java.util.Scanner;

public class Maxtill_i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mx=-9999999;
        int n= scanner.nextInt();
        int [] arr= new int[n];
        for (int i=0;i<n;i++){
            arr [i]= scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            mx=Integer.max(mx,arr[i]);
            System.out.print(mx);
        }


    }
}
