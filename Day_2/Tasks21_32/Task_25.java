package Day_2.Tasks21_32;
interface PaymentGateway{
    public void makepayment();
}class GooglePay implements PaymentGateway{
    @Override 
   public void makepayment(){
        System.out.println("Payment completed using GooglePay");
    }

}
class PhonePay implements PaymentGateway{
    @Override 
   public void makepayment(){
        System.out.println("Payment completed using PhonePay");
    }

}

public class Task_25 {
    public static void main(String[] args) {
        PaymentGateway pg=new GooglePay();
        pg.makepayment();
        PaymentGateway pg2=new PhonePay();
        pg2.makepayment();
    }
}
