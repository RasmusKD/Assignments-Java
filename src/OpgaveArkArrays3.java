import java.util.Scanner;

public class OpgaveArkArrays3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tabel = new int[10];
        int count = tabel.length;
        for (int i = 0; i<count;i++){
            tabel[i]=input.nextInt();
        }
        System.out.println(gennemsnit(tabel, count));
    }
    public static int gennemsnit(int[] tabel, int count){
        int min = tabel[0];
        for (int i = 0; i<count; i++){
            if (min > tabel[i]){
                min = tabel[i];
            }
        }
        return min;
    }
}
