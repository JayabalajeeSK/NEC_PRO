package EV2.BasicTopics;

class BankAccount 
{
    // Private fields (data hiding)
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) 
    {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }



    // Getter (read-only access)
    public String getAccountHolder() 
    {
        return accountHolder;
    }

    // Getter
    public double getBalance() 
    {
        return balance;
    }

    // Setter-like method (controlled update)
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance = balance + amount;
            System.out.println("Deposit successful! New Balance: " + balance);
        } 
        else 
        {
            System.out.println("Invalid deposit amount");
        }
    }

    // Setter-like method (controlled update)
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance = balance - amount;
            System.out.println("Withdrawal successful! New Balance: " + balance);
        } 
        else 
        {
            System.out.println("Invalid withdrawal amount");
        }
    }
}

public class EncapBank 
{
    public static void main(String[] args) 
    {
        BankAccount acc = new BankAccount("Jayabala", 17000);

        // Accessing data through methods (not directly)
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(500);   // Controlled deposit
        acc.withdraw(200);  // Controlled withdrawal
        acc.withdraw(2000); // Invalid withdrawal
    }
}
// Account Holder: Jayabala
// Balance: 17000.0
// Deposit successful! New Balance: 17500.0
// Withdrawal successful! New Balance: 17300.0
// Withdrawal successful! New Balance: 15300.0
