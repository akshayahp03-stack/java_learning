import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    String course;

    Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("----------------------");
    }
}

class StudentManSys {

    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nStudent Management System");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3.update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Course: ");
        String course = sc.nextLine();

        Student s = new Student(id, name, age, course);
        studentList.add(s);

        System.out.println("Student Added Successfully!");
    }

    public static void viewStudent() {
        if (studentList.isEmpty()) {
            System.out.println("No Students Found!");
        } else {
            for (Student s : studentList) {
                s.display();
            }
        }
    }

    public static void updateStudent() {
        System.out.print("Enter Student ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : studentList) {
            if (s.id == id) {
                System.out.print("Enter New Name: ");
                s.name = sc.nextLine();

                System.out.print("Enter New Age: ");
                s.age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Course: ");
                s.course = sc.nextLine();

                System.out.println("Student Updated Successfully!");
                return;
            }
        }
    }

    public static void deleteStudent() {
        System.out.print("Enter Student ID to Delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : studentList) {
            if (s.id == id) {
                studentList.remove(s);
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    public static void exit() {
        System.out.println("Exiting Student Management System. Goodbye!");
        System.exit(0);
    }

}