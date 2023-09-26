import java.util.Scanner;

public class Kap7Opgave3 {
    public static void main(String[] args) {
        System.out.println("Indtast heltal mellem 1 og 50");
        Scanner input = new Scanner(System.in);
        int[] tabel = new int[50];

        int tal;
        for (int i = 0; i <5; i++){
            tal = input.nextInt();
            tabel[tal]++;

        }
        for(int i =0; i < 50; i++){
            if (tabel[i] > 0) {
                System.out.println("tallet " + i + " forekommer " + tabel[i] + " gange");
            }
        }
    }
}
