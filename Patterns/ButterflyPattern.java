public class ButterflyPattern {

    public static void butterflyPattern(int num) {
        
        for(int i = 1 ; i <= num ; i++){

            for(int j = 1 ; j <= i; j++){
              System.out.print("*");
            }
            for(int j = 0 ; j <= num - 1 - i ; j++){
              System.out.print(" ");
            }

            for(int j = num ; j > 0 ; j--){
                if( j > i){
                    System.err.print(" ");
                }else{
                    System.err.print("*");
                }
            }
            System.out.println("");
        }

        
        for(int i = 0 ; i <= num ; i++){

            for(int j = num ; j > 0 ; j--){
                if( j > i){
                    System.err.print("*");
                }else{
                    System.err.print(" ");
                }
            }
              for(int j = 1 ; j <= num ; j++){
                if( j > i){
                    System.err.print("*");
                }else{
                    System.err.print(" ");
                }
            }
            System.out.println("");
        }

    }
    
    public static void main(String[] args) {
        butterflyPattern(5);
    }

}
