public class InvertedHalfPyramidNumbers {

    public static void invertedHalfNumberPyramid(int num){
        
        for(int i = num ; i > 0 ; i--){
            for(int j = 1 ; j <= i ; j++ ){
                System.out.print(j);
            }
            System.out.println("");
        }

    }
    
    public static void main(String[] args) {
        invertedHalfNumberPyramid(5);
    }

}
