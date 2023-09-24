import java.util.Scanner;

public class Opgave14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast vægt:");
        int vægt = scanner.nextInt();

        System.out.println("Er forsendelsen til Danmark? (true/false)");
        boolean tilDanmark = scanner.nextBoolean();

        System.out.println("Er det et quickbrev? (true/false)");
        boolean quickbrev = scanner.nextBoolean();

        int pris = beregnForsendelse(vægt, tilDanmark, quickbrev);
        if (pris == 0) System.out.println("Det indtastede er ikke gyldigt");
        else System.out.println("Prisen for forsendelsen er: " + pris);;

    }

    public static int beregnForsendelse(int vægt, boolean tilDanmark, boolean quickbrev) {
        if (vægt >= 2000) return 0;

        if (tilDanmark) {
            if (quickbrev) {
                return vægt < 100 ? 36 : vægt < 250 ? 72 : 96;
            } else {
                return vægt < 50 ? 12 : vægt < 100 ? 24 : vægt < 250 ? 48 : 60;
            }
        } else if (!quickbrev) {
            return vægt < 100 ? 32 : vægt < 250 ? 64 : 96;
        }

        return 0;
    }
}

