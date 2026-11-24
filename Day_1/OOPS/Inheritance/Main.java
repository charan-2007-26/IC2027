package Day_1.OOPS.Inheritance;

class Shape{//hybrid inheritance
    String color;
    void displaycolor(){
        System.out.println("Color ="+color);
    }

}
class circle extends Shape{
    void CalculateRadius(){

    }

}
class Rectangle extends Shape{

}
   
    public class Main {
        public static void main(String[] args) {
            circle c=new circle();
            Rectangle r=new Rectangle();
            
        }
    
        
    }
