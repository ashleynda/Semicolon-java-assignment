import java.util.Scanner;
public class FutureInvestment {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter investment amount:  ");
    double investmentAmount = input.nextDouble();

    System.out.print("Enter annual interest rate:  ");
    double annualInterestRate = input.nextDouble();

    System.out.print("Enter number of years:  ");
    double numberofyears = input.nextDouble(); 

    double monthlyInterestRate = annualInterestRate / 1200;
    double FutureInvestment= investmentAmount * Math.pow(1 + monthlyInterestRate,  numberofyears * 12);

    System.out.printf("The future investment value is %f%n", FutureInvestment);


}





}
