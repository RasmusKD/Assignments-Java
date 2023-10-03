import java.util.Scanner;

public class Kap7Opgave5 {
    public static void main(String[] args) {
        int[] numbersArray = new int[100];
        //Funktionen inputNumbers indlæser en række heltal og returnerer hvor mange tal der er indlæst.
        int antal = inputNumbers(numbersArray);
        int even = evenNumbers(numbersArray, antal);
        int uneven = unevenNumbers(numbersArray, antal);
        System.out.println("Lige tal: " + even);
        System.out.println("ulige tal: " + uneven);

    }
    public static int inputNumbers(int[] scoresArray){
        Scanner input = new Scanner(System.in);
        int tal = 1;
        int antalTal=0;
        while (tal != 0){
            tal=input.nextInt();
            if (tal != 0){
                scoresArray[antalTal] = tal;
                antalTal++;
            }
        }
        return antalTal;
    }
    public static int evenNumbers (int[] scoresArray, int antal){
        int lige = 0;
        for (int i = 0; i<antal;i++){
            if (scoresArray[i] % 2 == 0) {
                lige++;
            }

        }
        return lige;
    }
    public static int unevenNumbers (int[] scoresArray, int antal){
        int ulige = 0;
        for (int i = 0; i<antal;i++){
            if (scoresArray[i] % 2 != 0) {
                ulige++;
            }

        }
        return ulige;
    }
}
