interface UPIPayment{
    void pay();
}
interface Cashpayment{
    void pay();
}
class Payment implements UPIPayment, Cashpayment{
    public void pay(){
        System.out.println("payment done");
    }
    public static void main(String args[]){
        UPIPayment upi=new Payment();
        upi.pay();
    }
}