public class Kap6Opgave3 {
    public static void main(String[] args) {
        System.out.println(ispalindrome(1245));
        System.out.println(ispalindrome(1001));
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
    return reversed;
    }

    public static boolean ispalindrome(int number) {
        return reverse(number) == number;
    }
}
