import java.util.Scanner;

public class CompositeNumberPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the lower limit (a): ");
        int a = input.nextInt();

        System.out.print("Enter the upper limit (b): ");
        int b = input.nextInt();

        System.out.println("Composite numbers between " + a + " and " + b + ":");

        for (int i = a + 1; i <= b; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c > 2) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); 

        input.close();
    }
}