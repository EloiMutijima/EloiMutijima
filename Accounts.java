package Accounts;
class atms {
    static String location;
    static int maxWithdrawalLimit;

    public atms(String location, int maxWithdrawalLimit) {
        this.location = location;
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }

    public static String getLocation() {
        return location;
    }

    public static int getMaxWithdrawalLimit() {
        return maxWithdrawalLimit;
    }
}

class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount <= atms.getMaxWithdrawalLimit()) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or exceeds withdrawal limit.");
        }
    }
}

public class Accounts {
    public static void main(String[] args) {
        atms atm = new atms("Main Street", 500);
        Account account = new Account(1000);

        System.out.println("ATM Location: " + atm.getLocation());
        System.out.println("Maximum Withdrawal Limit: " + atm.getMaxWithdrawalLimit());
        System.out.println("Account Balance: " + account.getBalance());

        // Perform transactions
        account.deposit(500);
        System.out.println("New Account Balance after deposit: " + account.getBalance());

        account.withdraw(700);
        account.withdraw(300);
    }
}
