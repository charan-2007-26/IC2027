package MiniProjects.D3MiniProject1;

import java.util.Scanner;

class Student {
    // Private variables for encapsulation
    private int studentId;
    private String name;
    private String department;
    private int[] marks = new int[3];

    // Constructor to initialize student details
    public Student(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }

    // Overloaded constructor if marks are passed immediately
    public Student(int studentId, String name, String department, int[] marks) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int[] getMarks() {
        return marks;
    }

    // 4. Calculate Total
    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // 5. Calculate Average
    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    // 6. Calculate Grade based on document criteria
    public String calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 90 && avg <= 100) {
            return "A+";
        } else if (avg >= 80) {
            return "A";
        } else if (avg >= 70) {
            return "B";
        } else if (avg >= 60) {
            return "C";
        } else if (avg >= 50) {
            return "D";
        } else {
            return "Fail";
        }
    }

    // 7. Pass/Fail Status
    public String getResult() {
        return calculateAverage() >= 50 ? "PASS" : "FAIL";
    }

    // 2. Display Student Report
    public void displayStudent() {
        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Student ID  : " + studentId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Total Marks : " + calculateTotal());
        System.out.printf("Average     : %.1f\n", calculateAverage());
        System.out.println("Grade       : " + calculateGrade());
        System.out.println("Result      : " + getResult());
    }
}

public class Student_Management_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = null;
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Enter Marks");
            System.out.println("4. Calculate Total");
            System.out.println("5. Calculate Average");
            System.out.println("6. Calculate Grade");
            System.out.println("7. Pass/Fail");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume leftover newline
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    student = new Student(id, name, dept);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (student != null) {
                        student.displayStudent();
                    } else {
                        System.out.println("No student found. Please add a student first.");
                    }
                    break;

                case 3:
                    if (student != null) {
                        int[] marks = new int[3];
                        for (int i = 0; i < 3; i++) {
                            System.out.print("Enter Subject " + (i + 1) + " Marks: ");
                            marks[i] = sc.nextInt();
                        }
                        student.setMarks(marks);
                        System.out.println("Marks updated successfully!");
                    } else {
                        System.out.println("No student found. Please add a student first.");
                    }
                    break;

                case 4:
                    if (student != null) {
                        System.out.println("Total Marks: " + student.calculateTotal());
                    } else {
                        System.out.println("Please add a student first.");
                    }
                    break;

                case 5:
                    if (student != null) {
                        System.out.printf("Average Marks: %.1f\n", student.calculateAverage());
                    } else {
                        System.out.println("Please add a student first.");
                    }
                    break;

                case 6:
                    if (student != null) {
                        System.out.println("Grade: " + student.calculateGrade());
                    } else {
                        System.out.println("Please add a student first.");
                    }
                    break;

                case 7:
                    if (student != null) {
                        System.out.println("Result: " + student.getResult());
                    } else {
                        System.out.println("Please add a student first.");
                    }
                    break;

                case 8:
                    System.out.println("Exiting Student Management System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-8.");
            }
        } while (choice != 8);

        sc.close();
    }
}