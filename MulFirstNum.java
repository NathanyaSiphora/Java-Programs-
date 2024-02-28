import java.math.BigInteger;

public class MulFirstNum {
    public static void main(String[] args) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Multiplication of first 100 numbers: " + result);
    }
}