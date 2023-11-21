import java.util.Scanner;

public class GCDCalculator {

    static int calculateGCD(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first positive integer (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the second positive integer (n): ");
        int n = scanner.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("Please enter positive integers.");
        } else {
           
            int gcd = calculateGCD(m, n);
            System.out.println("The GCD of " + m + " and " + n + " is: " + gcd);
        }

        scanner.close();
    }
}
