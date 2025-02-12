package Task4;

//question-4

import java.util.HashMap;
import  java.util.Scanner;

public class StudentGrades {
    private HashMap<String,Integer> studentGrades;
    public StudentGrades(){
        studentGrades=new HashMap<>();
    }
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println(name + " added with grade: " + grade);
    }
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println(name + " has been removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public void displayStudentGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println(name + "'s grade: " + studentGrades.get(name));
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrades studentGrades = new StudentGrades();

        while (true) {
            System.out.println("\n--- Student Grades Management ---");
            System.out.println("1. to add Student");
            System.out.println("2. to remove Student");
            System.out.println("3. to display Student Grade");
            System.out.print("Choose an option (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student's name: ");
                    String addName = scanner.nextLine();
                    System.out.print("Enter " + addName + "'s grade: ");
                    int addGrade = scanner.nextInt();
                    studentGrades.addStudent(addName, addGrade);
                    break;

                case 2:
                    System.out.print("Enter the name of the student to remove: ");
                    String removeName = scanner.nextLine();
                    studentGrades.removeStudent(removeName);
                    break;

                case 3:
                    System.out.print("Enter student's name to see their grade: ");
                    String displayName = scanner.nextLine();
                    studentGrades.displayStudentGrade(displayName);
                    break;

                default:
                    System.out.println("invalid");
            }
        }
    }
}

