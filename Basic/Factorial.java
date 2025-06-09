public class Factorial{

public static int getFactorial(int a){
    int c = 1;
    for(int b = 1 ; b <= a ; b++){
        c *= b ;
    }
    return c ;
}

public static void main(String[] args){

   int factorial = getFactorial(7);
   System.out.println("FACTORIAL IS = " + factorial);

}

}