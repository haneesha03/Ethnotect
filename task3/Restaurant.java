import java.util.Scanner;
abstract class FoodOrder{
    public String customerId;
    public String Address;
    FoodOrder(){
        System.out.println("welcome");
    }
    FoodOrder(String customerId,String Address){
        this.customerId=customerId;
        this.Address=Address;
    }
    abstract void bill();
}
class PaneerBiryani extends FoodOrder{
    int quantity;
    static int price=100;
    PaneerBiryani(String customerId,String Address,int quantity){
        super(customerId,Address);
        this.quantity=quantity;
    }
    void bill(){
        System.out.println(customerId);
        System.out.println(Address);
        System.out.println("ordered paneerbiryani");
        System.out.println("Quantity ");
        System.out.println("Bill:"+(quantity*price));
    }
}
class ChickenBiryani extends FoodOrder{
    int quantity;
    static int price=150;
    ChickenBiryani(String customerId,String Address,int quantity){
        super(customerId,Address);
        this.quantity=quantity;
    }
    void bill(){
        System.out.println(customerId);
        System.out.println(Address);
        System.out.println("ordered Chickenbiryani");
        System.out.println("Quantity ");
        System.out.println("Bill:"+(quantity*price));
    }
}
class PaneerButterMasala extends FoodOrder{
    int quantity;
    static int price=120;
    PaneerButterMasala(String customerId,String Address,int quantity){
        super(customerId,Address);
        this.quantity=quantity;
    }
    void bill(){
        System.out.println(customerId);
        System.out.println(Address);
        System.out.println("ordered paneerbutterMasasla");
        System.out.println("Quantity ");
        System.out.println("Bill:"+(quantity*price));
    }
}
class  MashroomCurry extends FoodOrder{
    int quantity;
    static int price=90;
    MashroomCurry(String customerId,String Address,int quantity){
        super(customerId,Address);
        this.quantity=quantity;
    }
    void bill(){
        System.out.println(customerId);
        System.out.println(Address);
        System.out.println("ordered MashroomCurry");
        System.out.println("Quantity ");
        System.out.println("Bill:"+(quantity*price));
    }
}
class Restaurant {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your order Item");
        System.out.println("1 for paneer Biryani");
        System.out.println("2 for chickenBiryani");
        System.out.println("3 for paneerbutterMasala");
        System.out.println("4 for Mashroomcurry");

        int n=s.nextInt();
        FoodOrder order=null;
        if(n==1){
            order=new MashroomCurry("1","madanapalle",2);
            
        }
        else if(n==2){
            order=new ChickenBiryani("2","kothakota",4);
            
        }
        else if(n==3){
            order=new PaneerButterMasala("3","banglore",3);
        }
        else if(n==4){
            order=new MashroomCurry("3","tirupati",2);
        }
        if(order!=null){
            order.bill();
        }
        s.close();
    }
}