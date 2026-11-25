package Day_3;
class Manager{

}
class Developer{

}

public class Task_27 {
    public static void main(String[] args) {
        Object dev=new Developer();
        try {
            Manager mg=(Manager)dev;
        } catch (ClassCastException e) {
           System.out.println("Invalid Employee Role Conversion");
        }
        
    }
    
}
