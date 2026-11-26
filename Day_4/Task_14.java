import java.util.HashMap;
import java.util.Map;

public class Task_14 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> Emp = new HashMap<>();
        Emp.put(01, 10000);
        Emp.put(02, 50000);
        Emp.put(03, 75000);

        int highestId = -1;
        int highestSalary = 0;

        // Loop through each pair (ID, Salary)
        for (Map.Entry<Integer, Integer> entry : Emp.entrySet()) {
            int id = entry.getKey();
            int salary = entry.getValue();

            if (salary > highestSalary) {
                highestSalary = salary;
                highestId = id;
            }
        }

        System.out.println("Highest Salary Employee ID: " + highestId);
        System.out.println("Salary: " + highestSalary);
    }
}