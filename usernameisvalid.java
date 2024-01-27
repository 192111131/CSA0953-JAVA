import java.util.Scanner;

public class CompareUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        // Compare strings
        if (s1.equals(s2)) {
            System.out.println("User name valid");
        } else {
            System.out.println("User name Invalid");
        }

        scanner.close();
    }
}