import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        int count = 0;
        do {
            sum += numbers[count];
            count++;
        } while (count < n);
        double average = (double) sum / n;
        System.out.println("The average is: " + average);
        scanner.close();
    }
}
