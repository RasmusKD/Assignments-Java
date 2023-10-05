import java.util.Arrays;
import java.util.Scanner;

public class OpgaveArkDatafiler1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int antal = 10;
        System.out.println("indtast 10 tal");
        for (int i = 0; i < 10; i++){
            array[i] = input.nextInt();
        }
        udskriv(array, antal);
        System.out.println(gennemsnit(array, antal));
    }
    public static void udskriv(int[] a, int antal){
        for (int i = 0; i < antal; i++){
            System.out.println(a[i]);
        }
    }
    public static double gennemsnit(int[] a, int antal){
        int sum = 0;
        for (int i = 0; i < antal; i++){
            sum+=a[i];
        }

        return (double) sum /antal;
    }
}
