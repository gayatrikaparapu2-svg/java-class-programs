package accounts;
class Account {
    String accountNumber;
    double balance;
    String accountType;

    Account(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void transfer(Account receiver, double amount) {
        if (amount <= balance) {
            balance -= amount;
            receiver.balance += amount;
            System.out.println("Transferred: " + amount);
        } else {
            System.out.println("Transfer Failed");
        }
    }

    void display() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String accountNumber,
                   double balance,
                   double interestRate) {

        super(accountNumber, balance, "Savings");
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(String accountNumber,
                   double balance,
                   double overdraftLimit) {

        super(accountNumber, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft Limit Exceeded");
        }
    }
}

public class BankManagement {
    public static void main(String[] args) {

        SavingsAccount s1 =
                new SavingsAccount("S101", 10000, 5);

        CurrentAccount c1 =
                new CurrentAccount("C201", 5000, 2000);

        s1.deposit(2000);
        s1.withdraw(1000);
        s1.calculateInterest();

        s1.transfer(c1, 3000);

        s1.display();
        c1.display();
    }
}