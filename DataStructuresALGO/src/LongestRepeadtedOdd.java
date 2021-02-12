import java.util.Scanner;

//You are given an array A of N integers.
  //      Your task is to find the maximum number of times an odd number is continuously repeated in the array.
public class LongestRepeadtedOdd {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N=scanner.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scanner.nextInt();
        }
        int outPut=0;
        for(int i=0;i<N;i++){
            if(arr[i]%2==0){
                continue;
            }else {
                int p=arr[i];
                int k=1;
                for(int j=i;j<N;j++){
                    if(j>i){
                        if(p!=arr[j]){
                            break;
                        }else {
                            k++;
                        }
                    }
                }
                if(k>outPut){
                    outPut=k;
                }
            }
        }
        System.out.println(outPut);
    }
}
