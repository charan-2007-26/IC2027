package Day_2.Tasks21_32;
class Course{
    String CourseName;
    int Duration;
    double fee;
    Course(String CourseName,int Duration,double fee){
        this.CourseName=CourseName;
        this.Duration=Duration;
        this.fee=fee;
    }
    void displayCourse(){
        System.out.println("Course Name :"+CourseName+"\nDuration :"+Duration+"\nfees :"+fee);
    }
}

public class Task_30 {
    public static void main(String[] args) {
        Course course1=new Course("DSA", 6, 50000);
        course1.displayCourse();
        Course course2=new Course("java", 3, 10000);
        course2.displayCourse();
    }
    
}
