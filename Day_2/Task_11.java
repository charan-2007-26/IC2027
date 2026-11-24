package Day_2;
abstract class Employee{
    String Name;
    Employee(String Name){
        this.Name=Name;
    }
    void ShowName(){
        System.out.println("Employee Name : "+Name);
    }
    abstract void CalculateSalary(double MonthlySalary);
}
class FullTimeEmployee extends Employee{
    FullTimeEmployee(String Name){
        super(Name);
    }
    @Override 
    void CalculateSalary(double MonthlySalary){
        System.out.println("Monthly Salary: ₹" + MonthlySalary);

    }
    


}
public class Task_11 {
    public static void main(String[] args) {
        FullTimeEmployee fe=new FullTimeEmployee("Charan");
        fe.ShowName();
        fe.CalculateSalary(742386.83);
        
    }
    
}
