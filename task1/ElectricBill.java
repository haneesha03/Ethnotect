public class ElectricBill {
    public static void main(String args[]){
        int units = 250;
        double bill = 0;
        switch (units / 50) {
            case 0:  
            case 1:  
            case 2:  
                bill = 0; 
                break;

            case 3:  
                bill = (units - 150) * 1.0;
                break;

            default: 
                bill = 50 * 1.0 + (units - 200) * 5.0;
        }
        System.out.println("Total Bill: Rs. " + bill);
    }
}
