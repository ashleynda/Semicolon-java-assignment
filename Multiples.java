import java.util.Scanner;
public class Multiples{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    System.out.print("Enter number1:  ");
    int number1 = input.nextInt();

    System.out.print("Enter number2:  ");
    int number2 = input.nextInt();

    int squared = (number1 * number1) * (number2 * number2);
    int sum = (number1 * number2) + (number2 * number2);
    int difference = (number1 * number2) - (number2 * number2);
    
    
    System.out.printf("Squared is %d%n", squared);
    System.out.printf("Sum is %d%n", sum);
    System.out.printf("Difference is %d%n", difference);
    


    
}
}
