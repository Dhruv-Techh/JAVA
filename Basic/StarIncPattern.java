import java.util.Scanner;

public class StarIncPattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         int inp = sc.nextInt();
         
         for(int i = 0 ; i < inp ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println("");
         }

    }
}
