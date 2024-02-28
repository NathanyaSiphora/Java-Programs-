import java.util.Scanner;

public class SecLasDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        printSecondLastDigit(number);
        scanner.close();
    }
    
    public static void printSecondLastDigit(int number) {
        number = Math.abs(number);
        
        if (number < 10) {
            System.out.println("The number has less than two digits.");
        } else {
            int secondLastDigit = (number / 10) % 10;
            System.out.println("The second last digit of the number is: " + secondLastDigit);
        }
    }
}