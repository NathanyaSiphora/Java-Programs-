public class SumOfDigitOfnum {
    public static void main(String[] args) {
        int number = 12345;
        int digitSum = sumDigits(number);
        System.out.println("Sum of digits in " + number + " is: " + digitSum);
    }
    
    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}