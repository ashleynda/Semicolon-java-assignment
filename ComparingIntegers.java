import java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter integer:  ");
    int integer = input.nextInt();

    int squared = (integer * integer);


    if (integer > 100) {
      System.out.printf("%d > %d%n", integer, 100);
   }

    if (integer == 100) {
     System.out.printf("%d = %d%n", integer, 100);
   }

    if (integer != 100) {
      System.out.printf("%d != %d%n", integer, 100);
   }

    if (integer < 100) {
      System.out.printf("%d < %d%n", integer, 100);
   }
   
    if ((integer * integer)  > 100) {
      System.out.printf("%d > %d%n", integer, integer, 100);
   }

    if ((integer * integer) == 100) {
      System.out.printf("%d > %d%n", integer, integer, 100);
   }

    if ((integer * integer) != 100) {
      System.out.printf("%d > %d%n", integer, integer, 100);
   }

    if ((integer * integer) < 100) {
      System.out.printf("%d > %d%n", integer, integer, 100);
   }
    



}





}
