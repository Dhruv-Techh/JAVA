import java.util.Scanner;

public class HalfPyramidPattern {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int inp = sc.nextInt();
         
         for(int i = 0 ; i <= inp ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println("");
         }
    }

}
