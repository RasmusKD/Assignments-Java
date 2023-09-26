import java.util.Scanner;

public class OpgaveArkArrays2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tabel = new int[10];
        int count = tabel.length;
        for (int i = 0; i<count;i++){
            tabel[i]=input.nextInt();
        }
        System.out.println(gennemsnit(tabel, count));
    }
    public static double gennemsnit(int[] tabel, int count){
        int sum = 0;
        for (int i = 0; i<count; i++){
            sum += tabel[i];
        }
        return (double) sum /count;
    }
}
