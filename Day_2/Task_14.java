package Day_2;
interface Shape {
    public void calculateArea(double value);
}
class Square implements Shape{
    @Override
   public void calculateArea(double side){
    System.out.println( "Square Area: " + (side * side));

    } 

}class Circle implements Shape{
    @Override
   public void calculateArea(double radius){
    System.out.println( "Circle Area: " + (3.14 * radius * radius));

    } 

}

public class Task_14 {
    public static void main(String[] args) {
        Square sq=new Square();
        sq.calculateArea(12);
        Circle c=new Circle();
        c.calculateArea(21.00);
        
    }
    
}
