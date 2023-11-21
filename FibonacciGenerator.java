public class FibonacciGenerator {

    static void generateFibonacci(int n) {
        int[] fibonacci = new int[n];

        
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

   
        System.out.println("First " + n + " numbers of the Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    public static void main(String[] args) {
       
        generateFibonacci(50);
    }
}
