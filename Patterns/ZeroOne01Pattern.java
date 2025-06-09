public class ZeroOne01Pattern{

    public static void zeroOne(int num) {
        
        for(int i = 1 ; i <= num ; i++){
            for(int j = 1 ; j <= i ; j++){
                int sum = i + j ;
                if(sum % 2 == 0){
                    System.err.print("1");
                }else{
                    System.err.print("0");
                }
            }
            System.err.println("");
        }

    }
    
    public static void main(String[] args) {
        zeroOne(5);
    }

}
