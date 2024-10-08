import java.util.Scanner;

public class Booths {

    public int multiply(int n1, int n2) {
        int m = n1;
        int r = n2;
        int A = n1; // Accumulator
        int S = -n1; // Negative of multiplicand
        int P = 0; // Product
        int count = Integer.SIZE; // Size of integer (32 bits for typical int)

        System.out.print("Count: " + count + "\n");

        // Booth's algorithm
        while (count > 0) {
            if ((r & 1) == 1) {
                P += A;
            } else {
                P += S;
            }

            A <<= 1; // Left shift multiplicand
            S <<= 1; // Left shift negative multiplicand
            count--;
            r >>= 1; // Right shift multiplier
        }
        return P;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Booths b = new Booths();

        System.out.println("Enter two integer numbers -");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        int result = b.multiply(n1, n2);
        System.out.println("\nResult : " + n1 + " * " + n2 + " = " + result);

        scan.close(); // Close the scanner to prevent resource leakage
    }
}
