package Day_1.OOPS.Inheritance;
 class Vehicle{//Single inheritance
    String Brand="Tayota";
    void honk(){
        System.out.println("Beep! Beep!");
    }


}

public class Car extends Vehicle {
    String Modelname="Fortuner";
    void displayDetails(){
        System.out.println("Brand "+Brand);
        System.out.println("Model "+Modelname);

    }
    public static void main(String[] args) {
        Car c=new Car();
        c.displayDetails();
        c.honk();
        
    }
    
}
