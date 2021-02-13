import java.util.Arrays;
import java.util.Scanner;

public class mergedTwoArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m= scanner.nextInt();
        int[] arr1= new int[n];
        int [] arr2= new int[m];
        int [] arrOutput= new int[n+m];
        for (int i=0;i<n;i++){
            arr1[i]=scanner.nextInt();
         arrOutput[i]=arr1[i];
        }
        for (int i=0;i<m;i++){
            arr2[i]=scanner.nextInt();
            arrOutput[i+n]=arr2[i];
        }
        Arrays.sort(arrOutput);
        for (int i=0;i<n+m;i++)
       System.out.print(arrOutput[i]);


    }
}
