import java.util.Scanner;

public class ArrayAndSum {
    public  static  int count(int [][] arr,int n,int m, int sum){
        int count =0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(i<n-2){
                    int tot=arr[i][j]+arr[i+1][j]+arr[i+2][j];
                    if(tot==sum){
                        count++;

                    }
                }
                if (j<m-2){
                    int tot= arr[i][j]+arr[i][j+1]+arr[i][j+2];
                    if (tot==sum){
                        count++;

                    }
                }
                if (i<n-2&&j<m-2){
                    int tot=arr[i][j]+arr[i+1][j+1]+arr[i+2][j+2];
                    if (tot==sum){
                        count++;
                    }
                }
                if (i>=2&&j<m-2){
                    int tot=arr[i][j]+ arr[i-1][j+1]+arr[i-2][j+2];
                    if (tot==sum){
                        count++;
                    }
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int m = s.nextInt();
        int sum = s.nextInt();
        int [][] arr = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]= s.nextInt();

            }
        }
        System.out.println(count(arr,m,n,sum));
    }
}
