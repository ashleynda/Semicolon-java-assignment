import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number in pounds:  ");
    double numberinpounds = input.nextDouble();
    
    double convert = (numberinpounds * 0.454);

    System.out.printf("The number in kilograms is %f%n", convert);
        




}




}
