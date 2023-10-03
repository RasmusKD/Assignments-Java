import java.util.Scanner;

public class Kap7Opgave4 {
    public static void main(String[] args) {
        int[] scoresArray  = new int[100];
        int antal = inputScores(scoresArray);
        System.out.println(antal);
        double snit = gennemsnit(scoresArray, antal);
        System.out.println(snit);
        System.out.println(antalOverSnit(scoresArray, antal, snit) + " tal er over gennemsnittet");
        System.out.println(antalUnderSnit(scoresArray, antal, snit) + " tal er under gennemsnittet");
        int min = mindst(scoresArray, antal);
        System.out.println("Det mindste tal er " + min);
        udskriv(scoresArray, antal);
    }
    public static int inputScores (int[] scoresArray){
        Scanner input = new Scanner(System.in);
        int score = 0;
        int antalScores=0;
        while (score>=0){
            score=input.nextInt();
            if (score>=0){
                scoresArray[antalScores] = score;
                antalScores++;
            }
        }
        return antalScores;
    }
    public static void udskriv (int[] a, int antal) {
        for (int i = 0; i<antal;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static double gennemsnit(int[] scoresArray, int antal){
        double sum = 0;
        for (int i = 0; i < antal; i++){
            sum += scoresArray[i];
        }
    return sum/antal;
    }
    public static int antalOverSnit(int[] scoresArray, int antal, double snit){
        int overSnit = 0;
        for (int i = 0; i < antal; i++){
            if (scoresArray[i] > snit) overSnit++;
        }

    return overSnit;
    }
    public static int antalUnderSnit(int[] scoresArray, int antal, double snit){
        int underSnit = 0;
        for (int i = 0; i < antal; i++){
            if (scoresArray[i] < snit) underSnit++;
        }

        return underSnit;
    }
    public static int mindst(int[] scoresArray, int antal){
        int min = scoresArray[0];
        for (int i = 0; i<antal; i++){
            if (min > scoresArray[i]){
                min = scoresArray[i];
            }
        }
        return min;
    }
}
