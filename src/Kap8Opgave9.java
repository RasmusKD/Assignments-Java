import java.util.Scanner;

public class Kap8Opgave9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int spillerNr = 1;
        int r;
        int k;
        boolean vundet = false;
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        while (!vundet) {
            System.out.println("Spiller " + spillerNr + " angiv række og kolonne");
            r = input.nextInt();
            k = input.nextInt();
            while (( r > 2 || k > 2 || r < 0 || k < 0) || board[r][k] != ' '){
                System.out.println("Ugyldigt træk, spiller " + spillerNr + " angiv række og kolonne");
                r = input.nextInt();
                k = input.nextInt();
            }
            if (spillerNr==1) {
                board[r][k] = 'x';
                spillerNr = 2;
            }
            else {
                board[r][k] = 'O';
                spillerNr = 1;
            }
            udskriv(board);
            if (tjekVinder(board)==1){
                System.out.println("Spiller 1 har vundet");
                vundet=true;
            }
            if (tjekVinder(board)==2){
                System.out.println("Spiller 2 har vundet");
                vundet=true;
            }
        }
    }
    public static void udskriv (char[][] a){
        for (int i = 0; i < 3; i++){
            System.out.println("-------------");
            System.out.printf("| %c | %c | %c | \n", a[i][0], a[i][1], a[i][2]);
        }
        System.out.println("-------------");
    }
    public static int tjekVinder (char[][] a){
        int antalX;
        int antalO;
        for (int r = 0; r < 3; r++) {
            antalX = 0;
            antalO = 0;
            for (int k = 0; k < 3; k++) {
                if (a[r][k] == 'x') antalX++;
                if (a[r][k] == 'O') antalO++;
            }
            if (antalX == 3) return 1;
            if (antalO == 3) return 2;
        }

        for (int k = 0; k < 3; k++) {
            antalX = 0;
            antalO = 0;
            for (int r = 0; r < 3; r++) {
                if (a[r][k] == 'x') antalX++;
                if (a[r][k] == 'O') antalO++;
            }
            if (antalX == 3) return 1;
            if (antalO == 3) return 2;
        }
        return 0;
    }
}
