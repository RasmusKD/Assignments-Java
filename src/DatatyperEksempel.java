import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DatatyperEksempel {

    static void Udskriv(int[] tabel, int antal) {
        for (int i = 0; i < antal; i++)
            System.out.format("%d ", tabel[i]);
        System.out.println("");
    }

    static void IndlaesFraFil(int[] tabel) {
        try {
            File myObj = new File("MyFile1.txt");
            Scanner in = new Scanner(myObj);

            for (int i = 0; i < 10; i++)
                tabel[i] =in.nextInt();
            in.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    static void SkrivTilFil(int [] tabel,int antal)
    {
        try {
            PrintWriter ud = new PrintWriter("MyFile1.txt");
            for (int i = 0; i < antal; i++)
                ud.format("%d ", tabel[i]);
            ud.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }


    static void IndLaesStdio(int [] tabel)
    {
        try {
            Scanner ind = new Scanner(System.in);
            System.out.print("Indtats 10 tal: ");
            int i;
            for (i = 0; i < 10; i++) {
                tabel[i] = ind.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        try {
            int antal = 10;
            int[] a = new int[10];
            IndLaesStdio(a);
            Udskriv(a, antal);
            SkrivTilFil(a,antal);
            int[] a1 = new int[10];
            IndlaesFraFil(a1);
            Udskriv(a1, antal);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}