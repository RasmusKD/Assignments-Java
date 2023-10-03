import java.util.Scanner;

public class Kap7Opgave10 {
    public static void main(String[] args) {
        double[] numbersArray = new double[100];
        int antal = inputNumbers(numbersArray);
        int x = indexOfLargestElement(numbersArray, antal);
        System.out.println(x);
    }
    public static int inputNumbers(double[] scoresArray){
        Scanner input = new Scanner(System.in);
        int tal = 0;
        int antalTal=0;
        while (tal >= 0){
            tal=input.nextInt();
            if (tal >= 0){
                scoresArray[antalTal] = tal;
                antalTal++;
            }
        }
        return antalTal;
    }

    public static int indexOfLargestElement(double[] array, int antal){
        int index = 0;
        double max = 0;
        for (int i = 0; i < antal; i++){
            if (array[i] >= max){
                index=i;
            }
        }
        return index;
    }
}
