

public class BinaryToDecimal {

    public static int binToDec(int binaryNumber){
        int i = 0;
        double pow = 0;
        int sum = 0;

        while(binaryNumber > 0){
            int a = binaryNumber % 10;
            binaryNumber = binaryNumber / 10;
            
            pow = (Math.pow(2, i)) * a;
            i++;
            sum += pow;

        }
        return  sum;
    }
    
    public static void main(String[] args) {
        int binaryNumber = 101;
        int decimalNumber = 7;
        int sum = binToDec(binaryNumber);
        System.err.println("BINARY TO DECIMAL IS = " + sum);

    }

}
