package Day_2;
interface RemoteControl{
    public void turnON();
    default void bateryStatus(){
        System.out.println("Remote battery is 100%");
    }
}  class TV implements RemoteControl{
    @Override 
    public void turnON(){
        System.out.println("TV is turned ONN");

    }
}
  class AC implements RemoteControl{
    @Override 
    public void turnON(){
        System.out.println("AC is turned ONN");

    }
}

 class Task_16 {
    public static void main(String[] args) {
        RemoteControl tv=new TV();
        tv.turnON();
        tv.bateryStatus();
        RemoteControl ac=new AC();
        ac.turnON();
        ac.bateryStatus();
        
    }
    
}
