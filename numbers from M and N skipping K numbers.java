import java.util.Scanner;

public class SkipNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number (m): ");
        int m = input.nextInt();

        System.out.print("Enter the ending number (n): ");
        int n = input.nextInt();

        System.out.print("Enter the number of skips (k): ");
        int k = input.nextInt();

        for (int i = m; i <= n; i = i + k + 1) {
            System.out.print(i + " ");
        }

        input.close(); 
    }
}