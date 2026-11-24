package Day_2;
class Employee{
    int id;
    String Name;
    String Department="General";
    Employee(int id,String Name){
        this.id=id;
        this.Name=Name;
    }
    Employee(int id,String Name,String Department){
        this.id=id;
        this.Name=Name;
        this.Department=Department;

    }
    void displayEmployee(){
        System.out.println("Id :"+id+"\nName :"+Name+"\nDept :"+Department);
    }
}

public class Task_20 {
    public static void main(String[] args) {
        Employee emp=new Employee(01, "Charan");
        Employee emp2=new Employee(02, "Nagamma", "CSD");
        emp.displayEmployee();
        emp2.displayEmployee();
    }
}
