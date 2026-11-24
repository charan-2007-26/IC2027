package Day_2;
class Rectangle{
    double length;
    double width;
    Rectangle(){
        this.length=1.0;
        this.width=1.0;
    }Rectangle(double side){
        this.length=side;
    }Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    void CalculateArea(){
        System.out.println("Area :"+(length*width));
    }
}

public class Task_19 {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        Rectangle rec2=new Rectangle(87.0);
        Rectangle rec3=new Rectangle(10.9, 99.0 );
        rec.CalculateArea();
        rec2.CalculateArea();
        rec3.CalculateArea();
    }
    
}
