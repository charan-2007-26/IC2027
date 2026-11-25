package Day_3;
class EmployeeSalary{
    void setSalary(double salary){
       try {
         if(salary<=0){
                throw new IllegalArgumentException("Salary must be Greater than zeorr");
            }
            else {
            System.out.println("Employee Salary:Rs "+salary);
            }
        
       } catch (IllegalArgumentException e) {
        System.out.println("Salary must be Greater than zero");
       }
    }
}

public class Task_26 {
    public static void main(String[] args) {
        EmployeeSalary es=new EmployeeSalary();
        es.setSalary(25000.0);
        es.setSalary(500000.0);
        es.setSalary(-50000);
        es.setSalary(0);
        
    }
    
}

