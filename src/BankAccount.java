public class BankAccount {
    private double balance;
    private String name;

    public BankAccount(String name) {
        this.name = name;
        balance = 0.0;

    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " has $ " + balance);
    }

    public void withdrawal(double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println(name + " has $ " + balance);
        } else {
            System.out.println("insufficient balance");
        }
    }

    public void transfer(double amount, BankAccount acc) {
        if (this.balance < amount) {
            System.out.println("Transfer fails");
        } else {
            this.balance-=amount;// Sender account gets debited
            acc.balance+=amount; //Receiver account gets credited
            System.out.println("Account" + this.name + "becomes $" + this.balance);
            System.out.println("Account" + acc.name + "becomes $" + this.balance);

        }
    }
}