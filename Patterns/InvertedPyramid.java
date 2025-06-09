public class InvertedPyramid {

    public static void invertedPyramid(int num){

        for(int i = 1 ; i <= num ; i++){
            for(int j = num ; j > 0 ; j--){
                if( j > i){
                    System.err.print(" ");
                }else{
                    System.err.print("*");
                }
            }
            System.err.println("");
        }

    }
    
    public static void main(String[] args) {
        
        invertedPyramid(6);

    }

}
