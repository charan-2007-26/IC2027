package Day_2.Polymorphism.Compiletime;
class Printer{
    void print(int a){
        System.out.println("Integer :"+a);
    }
    void print(String text){
        System.out.println("Text :"+text);
    }
    void print(double d){
        System.out.println("Double :"+d);
    }

}

public class CTprinter {
    public static void main(String[] args) {
        Printer p=new Printer();
        p.print(2.0);
        p.print("charan");
        p.print(2197);
        
    }
    
}
