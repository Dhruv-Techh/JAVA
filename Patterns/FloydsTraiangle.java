public class FloydsTraiangle {

    public static void floydsTriangle(int lines) {
        
        int i = 0;
        int num = 1;

        while(i <= lines){
            for(int j = 0 ; j < i ; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");
            i++;
        }
   
    }
    
    public static void main(String[] args) {
        floydsTriangle(5);
    }

}
