import java.util.Scanner;

public class Kap6Opgave1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et heltal");
        int n = input.nextInt();
        int count = 0;

        for (int i = n; i < n + 100; i++) {
            System.out.printf("%7d", getPentagonalNumber(i));

            count++;

            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
