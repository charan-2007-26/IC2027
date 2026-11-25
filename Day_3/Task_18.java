package Day_3;
class EmailValidation{
    void validation(String email){
        if(email.isEmpty() && email.contains("@") && email.endsWith(".com") && email.startsWith("student") ){
            System.out.println("Valid Email");
        }else{
            System.out.println("Invalid Email");
        }
    }
}

public class Task_18 {
    public static void main(String[] args) {
        EmailValidation ev=new EmailValidation();
        ev.validation("");
        ev.validation("Charan");
        ev.validation("student@gmail");
        ev.validation("student@gmail.com");
    }
    
}
