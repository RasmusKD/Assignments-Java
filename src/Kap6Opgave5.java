import java.util.Scanner;

public class Kap6Opgave5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast 3 tal");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
        double high;
        double mid;
        double low;

        if (num1 > num2 && num1 > num3) high = num1;
        else if (num2 > num1 && num2 > num3) high = num2;
        else high = num3;
        if (num1 < num2 && num1 < num3) low = num1;
        else if (num2 < num1 && num2 < num3) low = num2;
        else low = num3;
        if (num1 > low && num1 < high) mid = num1;
        else if (num2 > low && num2 < high) mid = num2;
        else mid = num3;


        System.out.println(high + " " + mid + " " + low);
    }
}
