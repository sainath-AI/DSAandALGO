package ApnaCollageDSA;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int [] arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();

        }

        int counter =1;
        while(counter<n){
            for (int i=0;i<n-counter;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]=temp;
                }
            }
            counter++;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }

}
