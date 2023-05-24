import java.util.Scanner;
public class RunwayLength {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the speedV:  ");
    double speedV = input.nextDouble();

    System.out.print("Enter the accelerationA:  ");
    double accelerationA = input.nextDouble();

    double RunwayLength = (speedV * speedV) / (2 * accelerationA);

    System.out.printf("The minimum wave length is %f%n", RunwayLength);






}





}
