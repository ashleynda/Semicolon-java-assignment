import java.util.Scanner;
public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first integer:  ");
    int number1 = input.nextInt();

    System.out.print("Enter second integer:  ");
    int number2 = input.nextInt();

    System.out.print("Enter third integer:  ");
    int number3 = input.nextInt();

    int sum = (number1 + number2 + number3);
    int average = (number1 + number2 + number3) / 3;
    int product = (number1 * number2 * number3);
    int smallest = (number1 , number2, number3);
    int largest = (number1, number2, number3);
    
  
    System.out.printf("Sum is %d%n", sum);
    System.out.printf("Average is %d%n", average);
    System.out.printf("product is%d%n", product);
    System.out.printf("Smallest:" +getSmallest());
    System.out.printf("Largest:" +getLargest()); {
         if(number1 > number2 && number1 > number3)
        {
            System.out.println("Largest number is:"+number1);
        }
        else if(number2 > number3)
        {
            System.out.println("Largest number is:"+number2);
        }
        else
        {
            System.out.println("Largest number is:"+number3);
        }
      }
    





}






}
