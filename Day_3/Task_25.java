package Day_3;
class OnlinePayment{
    void paymentAmount(String amount){
        try {
            double pay=Double.parseDouble(amount);
            System.out.println(pay);
        } catch (NumberFormatException e) {
            System.out.println("Invalid payment amount");
        }
    }
}

public class Task_25 {
    public static void main(String[] args) {
        OnlinePayment op=new OnlinePayment();
        op.paymentAmount("789564");
        op.paymentAmount("789564.0");
        op.paymentAmount("abc");
        op.paymentAmount("543ndf");
    }
    
}
