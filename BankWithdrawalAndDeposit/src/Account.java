/*
Student Name: Terence Chu
Student ID: 301220117
*/

public abstract class Account extends Consumer{
    protected int accountNum;

    public Account(String id, String name, int accountNum){
        super(id, name);
        this.accountNum = accountNum;
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getAccountNum() {
        return accountNum;
    }

    //Change amount variable type to double because testing harness data given in double
    public abstract void withdraw (double amount);

    public abstract void deposit (double amount);

    @Override
    public String toString() {
        return super.toString() + " Account Number : " + this.accountNum;
    }
}
