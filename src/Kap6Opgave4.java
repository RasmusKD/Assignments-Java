import java.util.Scanner;

public class Kap6Opgave4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(reverse(n));
    }
    public static int reverse(int number){
        int reversed = 0;
        while (number !=0){
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        return reversed;
    }
}
