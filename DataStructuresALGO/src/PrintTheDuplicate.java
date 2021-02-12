import java.util.Scanner;

public class PrintTheDuplicate {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int N = s.nextInt();
        int [] arr = new int[N];
        for (int i=0;i<N;i++){
            arr[i]=s.nextInt();
        }
       // boolean check =false;
        for(int i=0;i<N-1;i++){
           if(arr[i]==arr[i+1]){
               System.out.println(arr[i]);
           }
        }

    }
}
// for(int i=0;i<n;i++){
// for (int j=i+1;J<n;J++){
//if(arr[i]==arr[j]){
//    sout(arr[j])
//        }
