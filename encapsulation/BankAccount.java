package ashraf.encapsulation;

import javax.naming.InitialContext;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        balance=initialBalance;
    }

    public double getBalance() {
        return balance;
    }
    public double depisit(double amount){
        if(amount>0){
           balance +=amount;
            System.out.println("Deposited: "+amount);
        }
        else {
            System.out.println("Amount is not a negative");
        }
        return balance;
    }
}
