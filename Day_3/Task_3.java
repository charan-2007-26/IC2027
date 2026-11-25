package Day_3;
class TextConverter{
    String message="Welcome to java PRogramming";
    void upper(){
        System.out.println("Uppercase :"+message.toUpperCase());

    }
    void lower(){
        System.out.println("Lowercase :"+message.toLowerCase());
    }
}

public class Task_3 {
    public static void main(String[] args) {
        TextConverter tc=new TextConverter();
        System.out.println("Original String"+tc.message);
        tc.upper();
        tc.lower();
        
    }
    
}
