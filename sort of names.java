import java.util.Arrays;
import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter names separated by space: ");
        String[] arr = input.nextLine().split(" ");

        System.out.print("Order (A/D): ");
        char order = input.next().charAt(0);

        if (order == 'A' || order == 'a') {
            Arrays.sort(arr);
        } else if (order == 'D' || order == 'd') {
            Arrays.sort(arr, (a, b) -> b.compareTo(a));
        } else {
            System.out.println("Invalid input for order. Please enter 'A' or 'D'.");
        }

        System.out.println("Sorted List of Names:");
        System.out.println(String.join("\n", arr));

        input.close();
    }
}