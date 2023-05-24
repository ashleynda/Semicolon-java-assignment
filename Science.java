import java.util.Scanner;
public class Science {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the amount of water in kilograms:  ");
    double kilograms = input.nextDouble();

    System.out.print("Enter the initial temperature:  ");
    double initialtemp = input.nextDouble();

    System.out.print("Enter the final temperature:  ");
    double finaltemp = input.nextDouble();

    double Science = kilograms * (finaltemp - initialtemp) * 4184;

    System.out.printf("The energy needed is %f%n", Science); 




}




}
