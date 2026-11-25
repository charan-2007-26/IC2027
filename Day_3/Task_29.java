package Day_3;
class BankTransaction{
    int balance=10000;
    void withdraw(String amount){
        try {
            int draw=Integer.parseInt(amount);
            if(draw>=0 && draw<=balance){
                throw new IllegalArgumentException();
            }
            balance-=draw;
            System.out.println("Remaining Balance :"+balance);

        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}

public class Task_29 {
   public static void main(String[] args) {
    BankTransaction bt=new BankTransaction();
    bt.withdraw("2334");
   }
}
