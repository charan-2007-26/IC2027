package Day_3;
class UsernameValidator{
    String username="Admin";
    String enteredUsername="ADMIN";

}

public class Task_5 {
    public static void main(String[] args) {
        UsernameValidator uv=new UsernameValidator();
        if((uv.username).equalsIgnoreCase(uv.enteredUsername)){
            System.out.println("Valid Username");
    }else{
        System.out.println("Invalid Username");
    }
        
    }
    
}
