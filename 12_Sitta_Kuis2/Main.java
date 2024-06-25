import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("001", "Clarin", "06-06-2000"));
        manager.addStudent(new Student("002", "Karina", "23-03-2000"));
        manager.addStudent(new Student("003", "Kiara", "23-04-2000"));
        manager.addStudent(new Student("004", "Alesa", "01-02-2000"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Access Student");
            System.out.println("4. All Student Data");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Select: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Birth Date: ");
                    String birthDate = scanner.nextLine();
                    manager.addStudent(new Student(id, name, birthDate));
                    System.out.println();
                    break;
                case 2:
                    System.out.print("ID Student: ");
                    id = scanner.nextLine();
                    manager.deleteStudent(id);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("ID Student: ");
                    id = scanner.nextLine();
                    System.out.println();
                    Student student = manager.getStudent(id);
                    if (student != null) {
                        System.out.println("Name: " + student.getName());
                        System.out.println("Birth Date: " + student.getBirthDate());
                    } else {
                        System.out.println("Student not found.");
                    }
                    System.out.println();
                    break;
                case 4:
                    manager.printAllStudents();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("The choice isn't valid.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
