import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];

        System.out.print("Enter the numbers of array: ");
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("The reverse of numbers in array:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(a[i]);
        }

        scanner.close();
    }
}