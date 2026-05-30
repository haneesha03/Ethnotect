class Account {
    public String bankId;
    public double amount;
    public Account(String bankId,double amount){
        this.bankId=bankId;
        this.amount=amount;
    }
    void deposit(double value) {
        amount = amount + value;
    }
    void withdraw(double value) {
        amount = amount - value;
    }
    double getAmount() {
        return amount;
    }
}
class SavingsAccount extends Account{
    public SavingsAccount(String bankId,double amount){
        super(bankId,amount);
    }
}
class MinorAccount extends Account{
    public MinorAccount(String bankId,double amount){
        super(bankId,amount);
    }
}

class BankOperations{
    public static void main(String args[]){
        SavingsAccount sa=new SavingsAccount("23691a2840",700000);
        MinorAccount ma=new MinorAccount("23872a3",50000);
        sa.withdraw(2000);
        System.out.println(sa.getAmount());
        ma.deposit(3000);
        System.out.println(ma.getAmount());
    }
}