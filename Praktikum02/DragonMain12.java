public class DragonMain12 {
    public static void main(String[] args) {
        Dragon12 dragon = new Dragon12(5, 5, 10, 10);
        dragon.printPosition();

        dragon.moveLeft();
        dragon.printPosition();

        dragon.moveUp();
        dragon.printPosition();

        dragon.moveRight();
        dragon.printPosition();

        dragon.moveDown();
        dragon.printPosition();

        dragon.detectCollision();
    }
}
