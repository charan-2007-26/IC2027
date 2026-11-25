package Day_3.Exception;

public class Arthimatic {
    public static void main(String[] args) {
        try {
            int res=3/0;
            
        } catch (ArithmeticException e) {
            System.out.println("Do not found");
            
        }
        
    }
    
}
