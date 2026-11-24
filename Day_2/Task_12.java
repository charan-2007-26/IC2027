package Day_2;
abstract class Appliance{
    void plugIn(){
        System.out.println("Appliance plugged into power");
    }
    abstract void operate();

}class Fan extends Appliance{
    void operate(){
        System.out.println("Fan is spinning at high speed");
    }
}class WashingMachine extends Appliance{
    void operate(){
        System.out.println("Washing machine is washing clothes");
    }
}

public class Task_12 {
    public static void main(String[] args) {
        Fan fan=new Fan();
        fan.plugIn();
        fan.operate();
        WashingMachine WM=new WashingMachine();
        WM.plugIn();
        WM.operate();
    }
    
}
