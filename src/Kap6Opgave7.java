import java.util.Scanner;

public class Kap6Opgave7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //opgave input 1000 9 30
        double investmentAmount = input.nextDouble();
        double monthlyInterestRate = input.nextDouble()/100/12; //f.eks. 9/100 = 0.09 = årlig procent, 0.09/12 = månedlig procent.
        int years = input.nextInt();
        futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        System.out.println("Years         Future Value");
        for (int i = 1; i <= 12 * years; i++){
            investmentAmount += (investmentAmount * monthlyInterestRate);

            if (i % 12 == 0){
                System.out.printf("%-12d", i/12); //%-12d = 12 karakterer, spaces efter.
                System.out.printf("%14.2f",investmentAmount); //%14.2f = 14 karakterer med 2 decimaler
                System.out.println();
            }
        }
        return investmentAmount;
    }
}
