import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");

        if (!sc.hasNext()) {
            System.out.println("Please enter a valid non-negative integer.");
            sc.close();
            return;
        }

        String input = sc.next();
        BigInteger n;

        try {
            n = new BigInteger(input);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid non-negative integer.");
            sc.close();
            return;
        }

        if (n.signum() < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
            sc.close();
            return;
        }

        BigInteger factorial = BigInteger.ONE;
        BigInteger i = BigInteger.ONE;

        while (i.compareTo(n) <= 0) {
            factorial = factorial.multiply(i);
            i = i.add(BigInteger.ONE);
        }

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}