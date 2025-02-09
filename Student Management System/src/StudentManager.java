
import java.util.ArrayList;
import java.util.Scanner;

    class StudentManager {
        private ArrayList<Student> students = new ArrayList<>();
        private Scanner scanner = new Scanner(System.in);

        public void addStudent() {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            students.add(new Student(id, name, age));
            System.out.println("Student added successfully!\n");
        }

        public void viewStudents() {
            if (students.isEmpty()) {
                System.out.println("No students found.\n");
                return;
            }
            for (Student student : students) {
                System.out.println(student);
            }
            System.out.println();
        }

        public void updateStudent() {
            System.out.print("Enter Student ID to update: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            for (Student student : students) {
                if (student.getId() == id) {
                    System.out.print("Enter new name: ");
                    student.setName(scanner.nextLine());
                    System.out.print("Enter new age: ");
                    student.setAge(scanner.nextInt());
                    System.out.println("Student updated successfully!\n");
                    return;
                }
            }
            System.out.println("Student not found.\n");
        }

        public void deleteStudent() {
            System.out.print("Enter Student ID to delete: ");
            int id = scanner.nextInt();

            students.removeIf(student -> student.getId() == id);
            System.out.println("Student deleted successfully (if existed).\n");
        }
    }


