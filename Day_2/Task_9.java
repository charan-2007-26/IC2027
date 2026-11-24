package Day_2;
 abstract class Animal{
    abstract void MakeSound();
    void sleep(){
        System.out.println("Animal is Sleeping");
    }

 }class Dog extends Animal{
    @Override 
    void MakeSound(){
        System.out.println("Bark Bark ");
    }
 }

public class Task_9 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.sleep();
        dog.MakeSound();
        
    }
    
}
