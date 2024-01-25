import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] a = new char[6];

        System.out.print("Enter the array of characters: ");
        for (int i = 0; i < 6; i++) {
            a[i] = scanner.next().charAt(0);
        }

        System.out.print("The reverse of the array of characters: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(a[i]);
        }

        scanner.close();
    }
}
