import java.util.Scanner;

public class OpgaveArkArrays1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tabel = new int[10];
        double sum = 0;

        for (int i = 0; i<10;i++){
            tabel[i]=input.nextInt();
        }
        int max = tabel[0];
        int min = tabel[0];
        for (int i = 0; i<10; i++){
            tabel[i] += 2;
            tabel[i] -= 2;
            sum += tabel[i];
            if (tabel[i] % 2 == 0){
                System.out.println(tabel[i]);
            }
            if (max < tabel[i]){
                max = tabel[i];
            }
            if (min > tabel[i]){
                min = tabel[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum/10);

    }
}
