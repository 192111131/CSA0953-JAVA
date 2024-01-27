import java.util.Scanner;

public class EvenFibonacciSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();

        int sum = 0;
        int prev = 0;
        int current = 1;

        while (current <= limit) {
            if (current % 2 == 0) {
                sum += current;
            }

            current = prev + (prev = current);
        }

        System.out.println("Sum of even Fibonacci numbers up to " + limit + ": " + sum);
    }
}