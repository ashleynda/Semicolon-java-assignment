import java.util.Scanner;
public class Acceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
      
        System.out.print("Enter velocity v0:  ");
        double velocityV0 = input.nextDouble();
        
        System.out.print("Enter velocity v1:  ");
        double velocityV1 = input.nextDouble();
        
        System.out.print("Enter time t:  ");
        double time = input.nextDouble();
        
        double acceleration = ((velocityV1 - velocityV0) / time);

        System.out.printf("The average acceleration is %f%n", acceleration);
        
}       
}
