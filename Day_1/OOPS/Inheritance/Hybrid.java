package Day_1.OOPS.Inheritance;
class Device{//Hybrid Inheritance
    String powerSource;
    void turnON(){
        System.out.println("Device power ONN");
    }

}class mobile extends Device{
    double ScreenSize;
    void MakeCall(){
        System.out.println("Calling");
    }

}class android extends mobile{
    void OpenPlaystore(){
        System.out.println("PlayStore");

    }

}class iphone extends mobile{
    void OpenAppStore(){
        System.out.println("App Store");

    }

}

public class Hybrid {
    public static void main(String[] args) {
        android a=new android();
        a.OpenPlaystore();
        a.MakeCall();
        iphone i=new iphone();
        i.MakeCall();
        i.OpenAppStore();
    }
}
