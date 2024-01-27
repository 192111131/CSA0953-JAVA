import java.util.Scanner;

public class CheckVotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
      
        System.out.print("Enter the age of the person: ");
        age = scanner.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are eligible to vote after: " + (18 - age) + " years");
        }

        scanner.close();
    }
}