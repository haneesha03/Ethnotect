class Cab {
    void payment(){
        System.out.println("Cab fare is 200");
    }
}
class Bike extends Cab{
    void payment(){
        System.out.println("Bike fare is 80");
    }
}
class Ride{
    public static void main(String args[]){
        Bike ride=new Bike();
        ride.payment();
        // ride=new Cab();
        Cab ride2=new Bike();
        ride2.payment();
        ride.payment();
    }
}