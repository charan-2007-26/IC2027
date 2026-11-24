package Day_2.Polymorphism.Runtime;
class Bank{
    void InterestRate(){
        System.out.println("Bank "+"0.0");
    }
}class SBI extends Bank{
    @Override 
    void InterestRate(){
        System.out.println("SBI "+"6.5");
    }
}
class HDFC extends Bank{
    @Override 
    void InterestRate(){
        System.out.println("HDFC "+"7.0");
    }
}

public class BankInterest {
    public static void main(String[] args) {
        Bank Bank=new Bank();
        Bank.InterestRate();;
        SBI sbi=new SBI();
        sbi.InterestRate();
        HDFC hdfc=new HDFC();
        hdfc.InterestRate();
        
    }
    
}
