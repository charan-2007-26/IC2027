package Day_3;
class NameExtractor{
    String fullName="Java Full Stack Developer";

}

public class Task_9 {
    public static void main(String[] args) {
        NameExtractor  ne=new NameExtractor();
        System.out.println(ne.fullName.substring(0,4));
        System.out.println(ne.fullName.substring(5,9));
        System.out.println(ne.fullName.substring(10));
        
    }
    
}
