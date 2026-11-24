package Day_1.OOPS.Encapsulationo;
class BankAccount{
    private String AccountHolder;
    private double Balance=1000;
    void setAccountHolder(String s){
        AccountHolder=s;
    }
     void getAccountHolder(){
       System.out.println(" AccountHolder "+ AccountHolder);
    }
    void setBalance(double amount){
        if(amount>0){
        Balance=amount;
        }else{
            System.out.println("Invalid balance");
        }
    }
    void getBalance(){
        System.out.println("Current Balance "+Balance);

    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount BA=new BankAccount();
        BA.setBalance(200);
        BA.getBalance();
        
    }
    
}
