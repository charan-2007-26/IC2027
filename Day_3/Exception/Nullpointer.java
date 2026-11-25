package Day_3.Exception;

public class Nullpointer {
    public static void main(String[] args) {
        String str=null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null values occur");
        }
    }
    
}
