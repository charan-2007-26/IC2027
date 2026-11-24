package Day_1.OOPS.Encapsulationo;

class Details{
    private String Name;
    private int Rno;
    void getName(){
        System.out.println(Name);
    }
     void getRno(){
        System.out.println(Rno);
    }
    void setName(String str ){
        Name=str;
    }
    void setRno(int no){
        Rno=no;
    }

}

public class Student {
    public static void main(String[] args) {
        Details dt=new Details();
        dt.setName("Charan");
        dt.getName();
        dt.setRno(3241);
        dt.getRno();
    }
    
}
