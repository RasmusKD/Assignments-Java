//Færdiggør nedenstående funktioner så main fungerer

import java.util.Arrays;

public class Opgaveark2dimArrays {
    public static void main(String[] args) {
        int [][] tabel=new int[3][4];
        inputData(tabel);
        udskrivData(tabel);
        int sum=sumTabel(tabel);
        int raekkeMedMindsteSum=raekkeMinSum(tabel);
        int raekkeMedStorsteSum=raekkeMaxSum(tabel);
        System.out.println("Summen er: "+sum);
        System.out.println("Rækken med den mindste sum er: "+raekkeMedMindsteSum);
        System.out.println("Rækken med den største sum er: "+raekkeMedStorsteSum);

        int [] tabelMedRaekkeSum=raekkeSum(tabel);
        //Indsæt statements til at udskrive værdierne i tabelMedRaekkeSum
        System.out.println(Arrays.toString(tabelMedRaekkeSum));
    }


    //Funktionen skal indlæse 12 integers i det 2-dimensionale arrayet a med 4 rækker og 3 kolonner
    public static void inputData(int [][] a){
        int x = 1;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                a[i][j]=x++;
            }
        }
    }
    //Funktionen skal udskrive værdierne i arrayet a
    public static void udskrivData(int [][] a){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Funktionen skal returnere summen af værdierne i arrayet a
    public static int sumTabel(int [][] a){
        int sum=0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                sum += a[i][j];
            }
        }
        return sum;
    }

    //Funktionen skal returnere rækkenummeret på rækken med mindste sum
    public static int raekkeMinSum(int [][] a){
        int minRaekke = 0;
        int minSum = 0;
        int sum = 0;
            for (int j = 0; j < 4; j++){
                minSum += a[0][j];
            }
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 4; j++){
                    sum+=a[i][j];
                }
                if (sum < minSum){
                    minSum = sum;
                    minRaekke = i;
                }
                sum=0;
            }
        return minRaekke;
    }

    //Funktionen skal returnere rækkenummeret på rækken med største sum
    public static int raekkeMaxSum(int [][] a){
        int maxRaekke = 0;
        int maxSum = 0;
        int sum = 0;
        for (int j = 0; j < 4; j++){
            maxSum += a[0][j];
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                sum+=a[i][j];
            }
            if (sum > maxSum){
                maxSum = sum;
                maxRaekke = i;
            }
            sum=0;
        }
        return maxRaekke;
    }

    public static int [] raekkeSum(int [][] a) {
        int[] rSum = new int[a.length];
        //Indsæt statements
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum += a[i][j];
            }
            rSum[i] = sum;
            sum = 0;
        }
        return rSum;
    }
}