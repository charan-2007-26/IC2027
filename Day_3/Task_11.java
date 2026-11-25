package Day_3;
class InputCleaner{
    String username="  JavaDeveloper  ";

}

public class Task_11 {
    public static void main(String[] args) {
        InputCleaner ic=new InputCleaner();
        System.out.println("Original input length :"+ic.username.length());
        System.out.println("Cleaned input length :"+ic.username.trim().length());
        System.out.println("Original input :"+ic.username);
        System.out.println("Cleaned input :"+ic.username.trim());
        
    }
    
}
