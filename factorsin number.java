import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        // Find and print the number of factors
        int countFactors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                countFactors++;
            }
        }

        System.out.println("Number of factors for " + n+ ": " + countFactors);

        scanner.close();
    }
}