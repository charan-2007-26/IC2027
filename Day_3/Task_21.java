package Day_3;
class ATM{
    double balance=10000;
    double withdrawAmount=0;
    
}

public class Task_21 {
    public static void main(String[] args) {
        ATM atm=new ATM();
        
        try {
            double div=atm.balance/atm.withdrawAmount;
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println("Invalid withdral Amount");
            
        }
        
    }
    }
    

