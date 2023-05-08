/*
Student Name: Terence Chu
Student ID: 301220117
*/

public class SavingsAccount extends Account{

    //Change balance variable type to double because testing harness data given in double
    private double balance;

    public SavingsAccount(String id, String name, int accountNum, Double balance){
        super(id, name, accountNum);

        if (balance == null) {
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAccountNum(int accountNum) {
        super.setAccountNum(accountNum);
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAccountNum() {
        return super.getAccountNum();
    }

    //Change amount variable type to double because testing harness data given in double
    @Override
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Withdraw request : $" + amount + "... Transaction CANCELLED. Insufficient funds.");
        } else if (this.balance - amount < 3000.00){
            System.out.println("Withdraw request : $" + amount + "... Transaction CANCELLED. Account balance cannot be less than $3000.00 after withdrawal.");
        } else {
            this.balance -= amount;
            System.out.println("Withdraw request : $" + amount + "... Transaction PROCESSED. Updated balance : $" + this.balance);
        }
    }

    //Change amount variable type to double because testing harness data given in double
    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit request : $" + amount + "... Transaction CANCELLED. Deposit amount must be $0.00 or greater.");
        } else {
            this.balance += amount;
            System.out.println("Deposit request : $" + amount + "... Transaction PROCESSED. Updated balance :$" + this.balance);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Balance : " + this.balance;
    }
}
