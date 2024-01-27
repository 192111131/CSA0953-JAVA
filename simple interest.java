import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        int principal = input.nextInt();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        System.out.print("Is the customer a senior citizen? (y/n): ");
        char isSenior = input.next().charAt(0);

        double interest = 0.0;

        if (isSenior == 'y') {
            interest = (principal * years * 0.12) / 100;
        } else {
            interest = (principal * years * 0.1) / 100;
        }

        System.out.print("Interest: " + interest);

        input.close();
    }
}