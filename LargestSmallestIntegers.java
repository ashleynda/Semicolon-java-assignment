import java.util.Scanner;
public class LargestSmallestIntegers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
   
    System.out.print("Enter first integer:  ");
    int first = input.nextInt();

    System.out.print("Enter second integer:  ");
    int second = input.nextInt();
        
    System.out.print("Enter third integer:  ");
    int third = input.nextInt();
        
    System.out.print("Enter fourth integer:  ");
    int fourth = input.nextInt();
        
    System.out.print("Enter fifth integer:  ");
    int fifth = input.nextInt();

    int largest;
    int smallest;   
     
    largest = first;
    if (second > first) {
        largest = second;
    }
    if (third > second) {
        largest = third;
    }
    if (fourth > third) {
        largest = fourth;
    }
    if (fifth > fourth) {
        largest = fifth;
    }

    System.out.printf("largest number is %d%n:", largest);


    smallest = first;
    if (second < first) {
        smallest = second;
    }
    if (third < second) {
        smallest = third;
    }
    if (fourth < third) {
        smallest = fourth;
    }
    if (fifth < fourth) {
        smallest = fifth;
    }
    
    System.out.printf("Smallest number is %d%n:", smallest);
    
        
    
        




}

}
