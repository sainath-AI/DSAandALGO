    import java.util.Scanner;
    public class SumOfSubarrysWithSubarray {


        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int length=scanner.nextInt();
            int [] arr=new int[length];
            String subArray="";
            for(int i=0;i<length;i++){
                arr[i]=scanner.nextInt();
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<length;i++){
                for(int j=i;j<length;j++){
                    int currentSum=0;
                    int [] ArraySet=new int[j-i+1];
                    int ArraySetIndex=0;
                    for(int k=i;k<=j;k++){
                        currentSum+=arr[k];
                        ArraySet[ArraySetIndex]=arr[k];
                        ArraySetIndex++;
                    }
                    if(currentSum>max){
                        max=currentSum;
                        subArray="";
                        for(int p = 0; p<ArraySet.length; p++){
                            subArray=subArray+ArraySet[p]+" ";
                        }
                    }
                }
            }
            System.out.println(max);
            System.out.println(subArray);
        }
    }

