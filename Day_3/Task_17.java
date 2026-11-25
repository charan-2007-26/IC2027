package Day_3;
class MessageBuilder{
    void fullname(String firstName,String lastName){
        String FullName=firstName.concat(" "+lastName);
        System.out.println("Welcome,"+FullName);
    }
}

public class Task_17 {
    public static void main(String[] args) {
        MessageBuilder mb=new MessageBuilder();
        mb.fullname("Rodda", "Charan");
        
    }
    
}
