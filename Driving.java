import java.util.Scanner;
public class Driving {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the driving distance:  ");
    double distance = input.nextDouble();

    System.out.print("Enter miles per gallon:  ");
    double miles = input.nextDouble();

    System.out.print("Enter price per gallon:  ");
    double price = input.nextDouble();

    double driving= (distance / miles * price);

    System.out.printf("The cost of driving is %f%n", driving);

}

}
