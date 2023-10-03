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
    public static void udskriv (char a[][]){
        System.out.println("-------------");
        System.out.printf("| %c | %c | %c | \n", a[0][0], a[0][1], a[0][2]);
        System.out.println("-------------");
        System.out.printf("| %c | %c | %c | \n", a[1][0], a[1][1], a[1][2]);
        System.out.println("-------------");
        System.out.printf("| %c | %c | %c | \n", a[2][0], a[2][1], a[2][2]);
        System.out.println("-------------");

    }
    public static int tjekVinder (char[][] a){
        int antalX=0;
        int antalO=0;
        for (int i = 0; i < 3; i++){
            antalX=0;
            antalX=0;
            for (int j =0; j<3; j++){
                if (a[i][j]=='X')
                    antalX++;
                if (a[i][j]=='O')
                    antalO++;
            }
            if(antalX==3){
                return 1;
            }
            if(antalX==3){
                return 2;
            }
        }
        return 0;
    }
}
