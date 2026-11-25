package Day_3;
class EmailChecker{
    void check(String email){
        if(email.contains("@gmail.com")){
            System.out.println("Valid Email");
        }else{
            System.out.println("@gmail.com is missing");
        }
    }
}

public class Task_6 {
    public static void main(String[] args) {
        EmailChecker ec=new EmailChecker();
        ec.check("charan887775");
        ec.check("charan887795@gmail.com");
    }
    
}
