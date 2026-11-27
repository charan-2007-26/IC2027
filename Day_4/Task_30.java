package Day_4;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;


public class Task_30 {
    public static void main(String[] args) {
        // 1. Store student names and marks using HashMap
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Aarav", 92);
        studentMarks.put("Diya", 76);
        studentMarks.put("Rohan", 92);
        studentMarks.put("Meera", 85);
        studentMarks.put("Kabir", 34);
        studentMarks.put("Ananya", 48);

        if (studentMarks.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        // 2. Store unique student marks using TreeSet (automatically sorted in ascending order)
        TreeSet<Integer> uniqueMarks = new TreeSet<>(studentMarks.values());

        // 3. Display all students with their marks
        System.out.println("=== Student Marks ===");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 4. Identify the highest and lowest marks using TreeSet first() and last()
        int lowestMark = uniqueMarks.first();
        int highestMark = uniqueMarks.last();
        System.out.println("\n=== Highest and Lowest Marks ===");
        System.out.println("Highest Mark: " + highestMark);
        System.out.println("Lowest Mark: " + lowestMark);

        // 5. Display all unique marks in ascending order
        System.out.println("\n=== Unique Marks (Ascending Order) ===");
        for (Integer mark : uniqueMarks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        // 6, 7, 8, 9. Compute scores > 80, class average, top performers, and pass/fail counts
        int totalMarks = 0;
        int passCount = 0;
        int failCount = 0;
        int passingThreshold = 40; // Adjust if your grading rubric uses a different pass mark

        System.out.println("\n=== Students Scoring Above 80 ===");
        boolean anyAbove80 = false;
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            String name = entry.getKey();
            int mark = entry.getValue();

            totalMarks += mark;

            if (mark > 80) {
                System.out.println("- " + name + " (" + mark + ")");
                anyAbove80 = true;
            }

            if (mark >= passingThreshold) {
                passCount++;
            } else {
                failCount++;
            }
        }
        if (!anyAbove80) {
            System.out.println("None");
        }

        // 7. Calculate the class average
        double classAverage = (double) totalMarks / studentMarks.size();
        System.out.printf("\n=== Class Average ===%nAverage Mark: %.2f%n", classAverage);

        // 8. Display the top-performing student or students (handles ties)
        System.out.println("\n=== Top-Performing Student(s) ===");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            if (entry.getValue() == highestMark) {
                System.out.println("- " + entry.getKey() + " (Score: " + entry.getValue() + ")");
            }
        }

        // 9. Display the number of students who passed and failed
        System.out.println("\n=== Pass / Fail Summary (Pass >= " + passingThreshold + ") ===");
        System.out.println("Passed: " + passCount);
        System.out.println("Failed: " + failCount);
    }
}
    

