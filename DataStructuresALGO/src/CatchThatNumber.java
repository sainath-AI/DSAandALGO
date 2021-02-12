import java.util.Scanner;

public class CatchThatNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int [] pos=new int[no*2];
        for(int i=0;i<no*2;i++){
            pos[i]=scanner.nextInt();  //2,3  1,1  4,2
        }
        int size=pos[0];
        for(int i=0;i<no*2;i++){
            if(size<pos[i]){
                size=pos[i];
            }
        }
        int p=0;
        int[][] arr1 = new int[size][size];
        for(int cons=0;cons<size;cons++){
            if(cons==0){
                p=1;
                arr1[cons][cons]=p;
            }
            else if(cons%2==1){
                for(int j=0;j<=cons;j++){
                    p+=1 ;
                    arr1[j][cons]=p;
                }
                for(int j=cons-1;j>=0;j--){
                    p+=1;
                    arr1[cons][j]=p;
                }
            }else{
                for(int j=0;j<=cons;j++){
                    p+=1;
                    arr1[cons][j]=p;
                }
                for(int j=cons-1;j>=0;j--){
                    p+=1;
                    arr1[j][cons]=p;
                }
            }
        }
        for(int i=0;i<no*2;i+=2){
            System.out.println(arr1[pos[i]-1][pos[i+1]-1]);    //  2,3   1,1   4,2
        }
    }
}
