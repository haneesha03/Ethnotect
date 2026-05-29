public class BankBalance {
    private double balance;
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String args[]){
        BankBalance bb=new BankBalance();
        bb.setBalance(30000.43);
        System.out.println(bb.getBalance());
    }
}
