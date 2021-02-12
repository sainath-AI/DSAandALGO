import java.util.Scanner;

public class MinimumNumberofJumpsToArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] arr= new int[n];
        for (int i=0; i<n;i++) {
            arr[i] = s.nextInt();
        }
        int count=0;
        for (int i=0;i<n-1;i+=arr[i]){
            count++;
        }
        System.out.println(count);
    }
}
