package Day_2.Tasks21_32;
interface SmartDevice{
    void connectWifi();
    default void deviceStatus(){
        System.out.println("Smart device is ready");
    }
}class SmartTV implements SmartDevice{
    @Override 
    public void connectWifi(){
        System.out.println("Smart TV connected to WiFi");
    }
}
class SmartWatch implements SmartDevice{
    @Override 
    public void connectWifi(){
        System.out.println( "Smart Watch connected to WiFi");
    }
}

public class Task_28 {
    public static void main(String[] args) {
        SmartDevice sd=new SmartTV();
        sd.deviceStatus();
        sd.connectWifi();
        SmartDevice sd2=new SmartWatch();
        sd2.deviceStatus();
        sd2.connectWifi();
        
    }
}
