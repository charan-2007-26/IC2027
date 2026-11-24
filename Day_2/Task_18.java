package Day_2;
class student{
    String name;
    double marks;
    student(String name,double marks){
        this.name=name;
        this.marks=marks;
        
    }
    void ShowResult(){
        System.out.println("Student Name :"+name+" Marks :"+marks);
    }
}
public class Task_18 {
    public static void main(String[] args) {
        student st=new student("Charan", 99.99);
        st.ShowResult();

    }
    
}
