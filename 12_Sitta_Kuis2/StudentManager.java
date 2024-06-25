import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StudentManager {
    private Map<String, Student> students;

    public StudentManager() {
        students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void deleteStudent(String id) {
        students.remove(id);
    }

    public Student getStudent(String id) {
        return students.get(id);
    }

    public void printAllStudents() {
        System.out.printf("%-10s %-20s %-15s%n", "ID", "Name", "Birth Date");
        System.out.println("---------------------------------------------------------");
        for (Student student : students.values()) {
            System.out.printf("%-10s %-20s %-15s%n", student.getId(), student.getName(), student.getBirthDate());
        }
    }
}