package Day_2.Tasks21_32;
interface Alert{
    void sendAlert(String message);
}class EmailAlert implements Alert{
    @Override 
   public void sendAlert(String message){
        System.out.println("Email Alert: "+message);

    }
}
class MobileAlert implements Alert{
    @Override 
   public void sendAlert(String message){
        System.out.println("Mobile Alert: "+message);

    }
}


public class Task_26 {
    public static void main(String[] args) {
        Alert ealert=new EmailAlert();
        ealert.sendAlert("some one try to login");
        Alert malert=new MobileAlert();
        malert.sendAlert("Battery is very low please charge");
    }
    
}
