import java.util.Scanner;
public class FeetToMeterConverter {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a value in feet:  ");
    double feet = input.nextDouble();

    double meters = feet * 0.305;
    
    System.out.println(feet + " feet is equal to " + meters + "meters");



}




}
