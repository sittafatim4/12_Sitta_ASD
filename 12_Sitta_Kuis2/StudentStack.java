import java.util.Stack;

public class StudentStack {
    private Stack<Student> stack;

    public StudentStack() {
        stack = new Stack<>();
    }

    public void pushStudent(Student student) {
        stack.push(student);
    }

    public Student popStudent() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }

    public Student peekStudent() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return null;
    }

    public void printAllStudents() {
        System.out.printf("%-10s %-20s %-15s%n", "ID", "Name", "Birth Date");
        System.out.println("---------------------------------------------------------");
        for (Student student : stack) {
            System.out.printf("%-10s %-20s %-15s%n", student.getId(), student.getName(), student.getBirthDate());
        }
    }
}
