import java.util.Scanner; // program uses class scanner
public class Comparison {
   public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
   System.out.print("Enter first integer: "); // prompt
   int number1 = input.nextInt(); // read first number from user

   System.out.print("Enter second integer: "); // prompt
   int number2 = input.nextInt(); // read second number from user

   if (number1 == number2) {
      System.out.printf("%d == %d%n", number1, number2);
   }

   if (number1 != number2) {
      System.out.printf("%d != %d%n", number1, number2);
   }

   if (number1 < number2) {
      System.out.printf("%d < %d%n", number1, number2);
   }

   if (number1 > number2) {
      System.out.printf("%d > %d%n", number1, number2);
   }

   if (number1 <= number2) {
      System.out.printf("%d <= %d%n", number1, number2);
   }

   if (number1 >= number2) {
      System.out.printf("%d >= %d%n", number1, number2);
   }
 }
}
