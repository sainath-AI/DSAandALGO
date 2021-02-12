//Masai School had hosted a Football tournament. You got hold of a profound description
  //      of the final match's process. On the whole, there are n lines in that description each of which desc
    //    ribed one goal. Every goal was marked with the name of the team that had scored it. Write a
      //  program to find the name of the team t
        //hat won the finals. It is guaranteed that the match did not end in a tie.


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FOotballTournament {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int arrayLength= scanner.nextInt();
        String[] arr=new String[arrayLength];
        for(int i=0;i<arrayLength;i++){
            arr[i]=scanner.next();
        }
        HashMap<String,Integer> hashMap=new HashMap<>();
        for(int i=0;i<arrayLength;i++){
            if(hashMap.containsKey(arr[i])){
                int count = hashMap.get(arr[i]);
                hashMap.put(arr[i],count+1);
            }
            else{
                hashMap.put(arr[i],1);
            }
        }
        String outPut="";
        int count=0;
        for(Map.Entry<String,Integer> map: hashMap.entrySet()){
            if(map.getValue()>count){
                count=map.getValue();
                outPut=map.getKey();
            }
        }
        System.out.println(outPut);
    }
}
