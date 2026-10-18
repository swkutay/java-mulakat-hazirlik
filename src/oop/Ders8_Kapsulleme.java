package oop;

class BankAccount{

    private String owner;
    private double balance;

    BankAccount(String owner, double initalBalance){
        this.owner = owner;
        if (initalBalance > 0) {
            this.balance = initalBalance;
        }
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        if (owner != null && !owner.isBlank()) {
            this.owner = owner;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}


public class Ders8_Kapsulleme {

    public static void main(String[] args) {

        BankAccount account =  new BankAccount("Harden", 1000);

        account.deposit(500);
        System.out.println(account.getBalance());

        account.deposit(-200);
        System.out.println(account.getBalance());

        boolean ok = account.withdraw(2000);
        System.out.println(ok);
        System.out.println(account.getBalance());

        ok = account.withdraw(300);
        System.out.println(ok);
        System.out.println(account.getBalance());

        account.setOwner("");
        System.out.println(account.getOwner());
        account.setOwner("Luka");
        System.out.println(account.getOwner());
    }


}
