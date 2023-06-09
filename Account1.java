public class Account1 {
        private String name;
        private double balance;

    public Account1(String name, double balance) {
        this.name = name;

    if (balance > 0.0) {
        this.balance = balance;
    }
  }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
    }
  }
   
    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;    
    }

    public String getName() {
        return name;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
       } else {
            System.out.println("Withdrawal amount exceeded account balance");
    }
   }

 
}
