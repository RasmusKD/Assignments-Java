import java.util.Arrays;

public class Kap7Opgave6 {

    public static void main(String[] args) {
        int[] primes = new int[50];
        printPrimes(primes);
    }

    // Function to check if a number is prime using previous prime numbers
    public static boolean isPrime(int number, int[] primes, int count) {
        for (int i = 0; i < count && primes[i] <= Math.sqrt(number); i++) {
            if (number % primes[i] == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to display the first 50 prime numbers
    public static void printPrimes(int[] primes) {
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are:");

        while (count < primes.length) {
            if (isPrime(number, primes, count)) {
                primes[count] = number;
                count++;

                if (count % 10 == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
            number++;
        }
    }
}
