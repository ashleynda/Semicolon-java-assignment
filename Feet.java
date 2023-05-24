import java.util.Scanner;
public class Feet {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a value for feet:  ");
    double feet = input.nextDouble();

    double meters = feet * 0.305;
    
    System.out.printf("The value in meters is %d%n ", feet);



}




}
