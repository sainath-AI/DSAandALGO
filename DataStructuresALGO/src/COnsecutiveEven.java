import java.util.Scanner;

public class COnsecutiveEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases=scanner.nextInt();
        for (int i=0;i<testcases;i++){
            int n=scanner.nextInt();
            boolean check=false;
            int [] arr=new int[n];
            for (int j=0;j<n;j++){
                arr[i]=scanner.nextInt();
            }
            for(int k=0;k<n-2;k++){
                if(arr[k]%2==0&&arr[k+1]==arr[k]+2&&arr[k+2]%2==arr[k]+4){
                    check=true;
                    break;
                }
            }
            if(check)
                System.out.println("No");
            else System.out.println("Yes");
        }

    }
}
