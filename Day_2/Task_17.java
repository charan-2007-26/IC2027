package Day_2;
class Car{
    String brand;
    int year;
    Car(String brand,int year){
        this.brand=brand;
        this.year=year;
    }
    void displayDetails(){
        System.out.println("Brand :"+brand+" year :"+year);

    }
}

public class Task_17 {
    public static void main(String[] args) {
        Car car=new Car("BMW", 2030);
        car.displayDetails();
        
    }
}
