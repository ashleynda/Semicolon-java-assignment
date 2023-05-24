import java.util.Scanner;
public class NumberOfYears{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.print("Enter the number of minutes:  ");
    int minutes = input.nextInt();

    int years = (minutes / (60 * 24 * 365));
    int day = (minutes / 60 * 24) % 365;

    System.out.printf(" The minutes is approximately %d years and %d days", minutes,years,days);




}





}

