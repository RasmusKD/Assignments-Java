import java.util.Scanner;

public class Kap7Opgave2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i<10; i++){
            array[i] = input.nextInt();
        }

        for (int i = 10-1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
