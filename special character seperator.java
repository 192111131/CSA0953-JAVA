import java.util.Scanner;

public class SpecialCharacterSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String s = scanner.nextLine();
        int len = s.length();
        char[] a = new char[len];
        int sp = 0;

        System.out.println("Special Characters:");

        for (int i = 0; i < len; i++) {
            a[i] = s.charAt(i);
            if (!(a[i] >= 'A' && a[i] <= 'Z') && !(a[i] >= 'a' && a[i] <= 'z') && !(a[i] >= '0' && a[i] <= '9')) {
                sp++;
                System.out.print(a[i]);
            }
        }

        System.out.println("Number of Special Characters: " + sp);

        scanner.close();