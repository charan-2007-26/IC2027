package Day_3;
class PasswordChecker{
    String password="Java@123";
    String Comformpassword="Java@123";

}

public class Task_4 {
    public static void main(String[] args) {
        PasswordChecker pc=new PasswordChecker();
        if((pc.password).equals(pc.Comformpassword)){
            System.out.println("Password matched");
        }else{
            System.out.println("Password Missmatched");
        }
        
    }
    
}
