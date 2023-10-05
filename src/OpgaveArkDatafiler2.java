import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
//a)	Opret en textfil “MinFil.txt”, hvor der skrives 10 integers i.
//b)	Lav et program, som kan indlæse (med Scanner) de 10 integer fra “MinFil.txt” i et integerarray.
//c)	Kald funktionen udskriv fra opgave 1 for at printe indholdet af arrayet til skærmen.
//d)	Kald funktionen gennemsnit fra opgave 1, og udskriv gennemsnittet til skærm.
//e)	Læg 10 til alle tallene i arrayet, og udskriv nu arrayets indhold (med Scanner) til en textfil “MinFil1.txt”.

public class OpgaveArkDatafiler2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int antal = 10;
        IndlaesFraFil(array);
        udskriv(array, antal);
        System.out.println(gennemsnit(array, antal));
    }
    public static void udskriv(int[] a, int antal){
        for (int i = 0; i < antal; i++){
            System.out.println(a[i]);
        }
    }
    public static double gennemsnit(int[] a, int antal){
        int sum = 0;
        for (int i = 0; i < antal; i++){
            sum+=a[i];
        }

        return (double) sum /antal;
    }
    static void IndlaesFraFil(int[] tabel) {
        try {
            File myObj = new File("MinFil.txt");
            Scanner in = new Scanner(myObj);

            for (int i = 0; i < 10; i++)
                tabel[i] =in.nextInt();
            in.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
