package Day_2.Polymorphism.Compiletime;

 class Calculator {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b, int c){
        System.out.println(a+b+c);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
} 
class Main{
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.add(5,6, 0);
        cal.add(2, 03,5);
        cal.add(2.1, 3.1);
        
    }
}
