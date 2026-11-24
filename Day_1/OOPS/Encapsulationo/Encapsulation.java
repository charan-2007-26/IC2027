package Day_1.OOPS.Encapsulationo;
class Encapsulation2 {
    private int age=25;
    void getter(){
        System.out.println(age);
    }
    void setter(int a){
        age=a;

    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Encapsulation2 e2=new Encapsulation2();
        e2.getter();
        e2.setter(19);
        e2.getter();
    }

    
}
