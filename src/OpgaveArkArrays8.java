import java.util.Arrays;
import java.util.Scanner;

public class OpgaveArkArrays8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] tabel = new String[10];
        int count = tabel.length;
        for (int i = 0; i<10;i++){
            tabel[i]=input.next();
        }
        System.out.println(Arrays.toString(overFem(tabel, count)));
    }
    public static String[] overFem (String[] tabel, int count) {
        int antal = 0;
        for (int i = 0; i < count; i++) {
            if (tabel[i].length() > 5) {
                antal++;
            }
        }
        String[] overFem = new String[antal];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (tabel[i].length() > 5) {
                overFem[index] = tabel[i];
                index++;
            }
        }
        return overFem;
    }
}
