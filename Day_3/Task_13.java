package Day_3;
class InputValidator{
    String userInput=" ";
}

public class Task_13 {
    public static void main(String[] args) {
        InputValidator iv=new InputValidator();
        if (iv.userInput.isBlank()) {
            System.out.println("Invalid Input");
            
        }else{
            System.out.println("Valid Input");
        }
    }
    
}
