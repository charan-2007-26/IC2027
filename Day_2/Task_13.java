package Day_2;
interface Notification{
   public void sendNotification();
}
class EmailNotification implements Notification{ 
    @Override 
 public void sendNotification(){
        System.out.println("Sending notification via Email");

    }
}
class SMSNotification implements Notification{
    @Override 
   public void sendNotification(){
        System.out.println("Sending notification via SMS");
    }
}
public class Task_13 {
    public static void main(String[] args) {
        EmailNotification en=new EmailNotification();
        en.sendNotification();
        SMSNotification sms=new SMSNotification();
        sms.sendNotification();
        
    }
}
