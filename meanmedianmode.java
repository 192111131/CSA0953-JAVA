import java.util.Arrays;
import java.util.Scanner;

public class ArrayStatsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int a[] = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();
        }

        // Calculate Mean
        int sum = Arrays.stream(a).sum();
        double mean = (double) sum / size;
        System.out.println("Mean: " + mean);

        // Sort the array for calculating Median
        Arrays.sort(a);
        int mid = size / 2;

        // Calculate Median
        if (size % 2 == 0) {
            System.out.println("Median: " + ((double) a[mid - 1] + a[mid]) / 2);
        } else {
            System.out.println("Median: " + a[mid]);
        }

        // Calculate Mode
        int mode = findMode(a);
        System.out.println("Mode: " + mode);

        input.close();
    }

    private static int findMode(int[] a) {
        int mode = 0, maxFrequency = 0;

        for (int i = 0; i < a.length; i++) {
            int frequency = 1;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    frequency++;
                }
            }

            if (frequency > maxFrequency) {
                mode = a[i];
                maxFrequency = frequency;
            }
        }

        return mode;
    }
}