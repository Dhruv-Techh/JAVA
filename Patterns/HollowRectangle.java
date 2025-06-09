public class HollowRectangle {

    public static void rectanglePattern(int height , int width){
        for(int i = 1 ; i <= height ; i++){
            for(int j = 1 ; j<= width ; j++){
                if((i == 1 || i == height) || (j == 1 || j == width)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.err.println("");
        }
    }
    
    public static void main(String[] args) {
        
        int height = 10;
        int width = 7;

        rectanglePattern(height, width);

    }

}
