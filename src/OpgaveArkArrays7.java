import java.util.Arrays;
import java.util.Scanner;

public class OpgaveArkArrays7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tabel = new int[10];
        int count = tabel.length;
        for (int i = 0; i<10;i++){
            tabel[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(ligeTal(tabel, count)));
    }
    public static int[] ligeTal (int[] tabel, int count) {
        int antal = 0;
        for (int i = 0; i < count; i++) {
            if (tabel[i] % 2 == 0) {
                antal++;
            }
        }
        int[] evenNumbers = new int[antal];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (tabel[i] % 2 == 0) {
                evenNumbers[index] = tabel[i];
                index++;
            }
        }
        return evenNumbers;
    }
}
