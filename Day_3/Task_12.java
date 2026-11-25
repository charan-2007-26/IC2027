package Day_3;
class formValidator{
    String name="";
}

public class Task_12 {
    public static void main(String[] args) {
        formValidator fv=new formValidator();
        if(fv.name.isEmpty()){
            System.out.println("Name Required");
        }else{
            System.out.println("Name Submitted successfully");
        }
    }
    
}
