package Assignment_3;
import java.util.*;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int[] num = new int[size];

        try {
            for (int i = 0; i < 10; i++) {
                num[i] = sc.nextInt();
            }

            System.out.println("Array: " + java.util.Arrays.toString(num));

            for (int i = 0; i < 10; i++) {
                if (num[i] % 2 == 0) {
                    System.out.println("Even numbers are: " + num[i]);
                }
            }
        } finally {
            sc.close();
        }
    }
}