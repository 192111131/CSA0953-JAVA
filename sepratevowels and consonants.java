import java.util.Scanner;

public class SeparateVowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String statement = scanner.nextLine().toLowerCase(); 
        String vowels = "";
        String consonants = "";

        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels += ch;
                } else {
                    consonants += ch;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        scanner.close();
    }
}