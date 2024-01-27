import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Print Pascal's Triangle
        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("   ");
            }

            // Initialize the value for each row
            int value = 1;

            // Print numbers
            for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", value);
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }

        scanner.close();
    }
}