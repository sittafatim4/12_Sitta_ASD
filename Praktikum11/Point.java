public class Point {

    String question;
    String answer;
    Point nextNode;
    public Point nextPoint;

    Point(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.nextNode = null;
    }
}