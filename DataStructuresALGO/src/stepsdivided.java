
import java.util.*;

public class stepsdivided {

        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int div=n/5;
            int rem=0;
            if(n%5!=0){
                rem =1;
            }

            System.out.println(div+rem);

        }
    }

