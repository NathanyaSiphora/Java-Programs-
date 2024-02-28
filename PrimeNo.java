import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();
        System.out.println("Prime numbers within the range " + start + " to " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}