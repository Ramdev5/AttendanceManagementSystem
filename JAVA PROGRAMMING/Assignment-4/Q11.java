class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public double checkBalance() {
        return balance;
    }
}

public class Q11 {
    public static void main(String[] args) {
        Account account = new Account(1000.0); // Initial balance is $1000

        System.out.println("Initial Balance: " + account.checkBalance());

        account.deposit(500.0);
        account.withdraw(300.0);
        account.withdraw(800.0); // Attempting to withdraw more than balance
        account.deposit(-200.0); // Attempting to deposit a negative amount

        System.out.println("Final Balance: " + account.checkBalance());
    }
}
