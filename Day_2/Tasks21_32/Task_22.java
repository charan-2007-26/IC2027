package Day_2.Tasks21_32;
abstract class BankAccount{
    abstract void calculateInterest(double balance);
    void displayAccountType(){
        System.out.println("Bank Account Details");
    }
}class SavingsAccount extends BankAccount{
    @Override 
    void calculateInterest(double balance){
        System.out.println("Interest :"+balance*0.05);

    }
}

public class Task_22 {
    public static void main(String[] args) {
        SavingsAccount sa=new SavingsAccount();
        sa.calculateInterest(50000.00);
        sa.displayAccountType();
        
    }
    
}
