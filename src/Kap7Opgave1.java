import java.util.Scanner;
//Ikke Færdig
public class Kap7Opgave1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast antal studenter");
        int students = input.nextInt();
        System.out.println("Indtast alle karakterer");
        int[] karakterer = new int[students];
        grades(karakterer, students);

    }
    public static void grades (int[] karakterer, int students){
        for (int i = 0; i < students; i++){
            System.out.println("Student " + i + " score is " + karakterer[i] + " and grade is " );
        }

    }
}
