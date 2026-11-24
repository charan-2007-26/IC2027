package Day_2;
abstract class Shape{
   abstract void CalculateArea(double radius);
   void Message(){
    System.out.println("Calculating area of the shape...");
   }
}class Circle extends Shape{
    @Override 
    void CalculateArea(double radius){
        System.out.println(3.14 * radius * radius);
    }

}

public class Task_10 {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.CalculateArea(38.00);
    }
    
}
