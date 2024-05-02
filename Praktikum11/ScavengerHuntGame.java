import java.util.Scanner;
public class ScavengerHuntGame {

    Point head;

    ScavengerHuntGame() {
        this.head = null;
    }

    void addPoint(String question, String answer) {
        Point newNode = new Point(question, answer);
        if (head == null) {
            head = newNode;
        } else {
            Point current = head;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = newNode;
        }
    }

    boolean playGame() {
        Scanner scanner = new Scanner(System.in);
        Point current = head;
        while (current != null) {
            System.out.println(current.question);
            System.out.print("Jawaban Anda: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(current.answer)) {
                System.out.println("Jawaban Anda benar! Anda dapat melanjutkan ke point berikutnya.");
                current = current.nextNode;
            } else {
                System.out.println("Jawaban Anda salah! Coba lagi.");
                return false; 
            }
        }
        scanner.close();
        return true; 
    }
}