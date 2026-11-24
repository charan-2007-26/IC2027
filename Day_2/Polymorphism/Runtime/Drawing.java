package Day_2.Polymorphism.Runtime;
class Shape{
    void Draw(){
        System.out.println("Drawing ...");
    }
}class Circle extends Shape{
    @Override 
    void Draw(){
        System.out.println("Drawing Circle");
    }
}class Square extends Shape{
    @Override 
    void Draw(){
        System.out.println("Drawing Square");
    }
}


public class Drawing {
    public static void main(String[] args) {
        Shape c=new Circle();
        c.Draw();
        c=new Square();
        c.Draw();


        
    }
    
}
