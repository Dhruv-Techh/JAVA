
import java.util.Scanner;

public class SumOfNaturaLNumbers {
    
     public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         int inp = sc.nextInt();
         int sum = 0;
         for(int i = 0 ; i <= inp ; i++){
            sum += i;
         }

         System.out.println("SUM = " + sum);

     }

}
