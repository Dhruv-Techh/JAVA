
import java.util.Scanner;

public class SquarePattern {
    
     public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         int inp = sc.nextInt();
         
         for(int i = 0 ; i < inp ; i++){
            for(int j = 0 ; j < inp ; j++){
                System.out.print("*");
            }
            System.out.println("");
         }

       

     }

}
