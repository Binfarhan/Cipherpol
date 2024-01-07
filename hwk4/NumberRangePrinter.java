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
            printOddNumbersInRange(firstNumber, secondNumber);
        } else {
            System.out.println("Invalid input: The second number should be greater than the first number.");
        }
    }

    private static void printOddNumbersInRange(int start, int end) {
        System.out.println("Odd numbers between " + start + " and " + end + " (exclusive):");

        for (int i = start + 1; i < end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
