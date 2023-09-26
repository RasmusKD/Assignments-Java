import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] tabel = new int[5];

        for (int i = 0; i<5;i++){
            tabel[i]=input.nextInt();
        }

        for (int i =0; i < 5; i++){
            if (tabel[i]>15){
                System.out.println(tabel[i]);
            }
        }
    }
}
