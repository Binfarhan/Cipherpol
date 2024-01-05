import java.util.Scanner;

public class NumberRangePrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        scanner.close();

        if (firstNumber < secondNumber) {
            printNumbersInRange(firstNumber, secondNumber);
        } else {
            System.out.println("Invalid input: The second number should be greater than the first number.");
        }
    }

    private static void printNumbersInRange(int start, int end) {
        System.out.println("Numbers between " + start + " and " + end + " (exclusive):");

        for (int i = start + 1; i < end; i++) {
            System.out.println(i);
        }
    }
}
