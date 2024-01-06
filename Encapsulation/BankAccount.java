public class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        // You can add validation here to ensure that amount is non-negative
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        // You can add validation here to ensure sufficient balance
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public static void main(String[] args) {
        // Create a BankAccount instance
        BankAccount account = new BankAccount("123456789", 1000.0);

        // Access and display account information
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Perform transactions
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(1500.0);  // This withdrawal will fail due to insufficient funds
    }
}
