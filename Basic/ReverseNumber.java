
import java.util.Scanner;

public class ReverseNumber {
    
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
         int inp = sc.nextInt();
         String reverse = "";
         while(inp != 0){
            int lastDigit = inp % 10; 
            reverse = reverse + lastDigit;
            inp = inp / 10;
         }
         System.out.println("Reverse num is = " + reverse);
    }

}
