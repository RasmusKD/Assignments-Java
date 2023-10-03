import java.util.Arrays;
import java.util.Scanner;

public class Kap8Opgave5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [][] Matrix1 = new double[2][2];
        double [][] Matrix2 = new double[2][2];
        System.out.println("Skriv indput for matrix1");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.println("Skriv indput for matrix2");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Matrix2[i][j] = input.nextDouble();
            }
        }

        System.out.println(Arrays.deepToString(addMatrix(Matrix1, Matrix2)));
    }
    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] c = new double[2][2];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                c[i][j] += a[i][j] + b[i][j];
            }
        }

        return c;
    }
}
