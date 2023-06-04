import java.util.Scanner;     
public class Account1Test{
    public static void main(String[] args) {
        Account1 account1 = new Account1("Jane Blue", 50.00);
        Account1 account2 = new Account1("John Red", -7.53);
      

        System.out.printf("%s balance: $%.2f%n", account1.getName(), 
            account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
            account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit ammount for account1:  ");
        double depositAmount1 = input.nextDouble();
        System.out.printf("%n adding %.2f to account1 to balance%n%n", depositAmount1);
        account1.deposit(depositAmount1);


        System.out.printf("%s balance: $%.2f%n",
            account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
            account2.getName(), account2.getBalance());


        System.out.print("Enter withdrawal amount for account1:  ");
        double withdrawalAmount1 = input.nextDouble();
        System.out.printf("%n adding %.2f to account1 to balance%n%n", withdrawalAmount1);
        account1.withdrawal(withdrawalAmount1);

        System.out.printf("%s balance: $%.2f%n",
            account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
            account2.getName(), account2.getBalance());
        

        System.out.print("Enter deposit ammount for account2:  ");
        double depositAmount2 = input.nextDouble();
        System.out.printf("%n adding %.2f to account2 to balance%n%n", depositAmount2);
        account2.deposit(depositAmount2);

        
        System.out.printf("%s balance: $%.2f%n",
            account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
            account2.getName(), account2.getBalance());


        System.out.print("Enter withdrawal amount for account2:  ");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 to balance%n%n", withdrawalAmount);
        account2.withdrawal(withdrawalAmount);


        System.out.printf("%s balance: $%.2f%n",
            account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
            account2.getName(), account2.getBalance());



}
}
