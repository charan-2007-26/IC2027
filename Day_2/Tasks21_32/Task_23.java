package Day_2.Tasks21_32;
abstract class Payment{
    double amount;
    Payment(double amount){
        this.amount=amount;
    }
    void showAmount(){
        System.out.println("Payment Amount : Rs "+amount);
    }
    abstract void processPayment();

}class UPIPayment extends Payment{
    UPIPayment(double amount){
        super(amount);
    }
    @Override 
    void processPayment(){
        System.out.println("Payment processed successfully using UPI");
    }
}


public class Task_23 {
    public static void main(String[] args) {
        UPIPayment upi=new UPIPayment(50000);
        upi.processPayment();
        upi.showAmount();
        
    }
    
}
