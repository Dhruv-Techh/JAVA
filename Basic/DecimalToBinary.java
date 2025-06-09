public class DecimalToBinary {

    public static int decToBin(int decNumber){

        int pow = 0;
        int binNum = 0;

        while(decNumber > 0){
        System.out.println("decNumber = " + decNumber);
          int rem = decNumber % 2;
          System.out.println("rem = " + rem);
          binNum = binNum + (rem * (int)Math.pow(10, pow));
          System.out.println("binNum = " + binNum);
          decNumber/=2;
          pow++;

        }

        return binNum;
    }
    
    public static void main(String[] args) {
        
        int decToBin = decToBin(10);
        System.out.println("DECIMAL TO BINARY = " + decToBin);

    }

}
