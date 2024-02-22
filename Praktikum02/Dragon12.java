public class Dragon12 {
    private int x;
    private int y;
    private int width;
    private int height;

    public Dragon12(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        x--;
        if (x < 0) {
            detectCollision();
        }
    }

    public void moveRight() {
        x++;
        if (x >= width) { 
            detectCollision();
        }
    }

    public void moveUp() {
        y--;
        if (y < 0) {
            detectCollision();
        }
    }

    public void moveDown() {
        y++;
        if (y >= height) { 
            detectCollision();
        }
    }

    public void printPosition() {
        System.out.println("Dragon position: (" + x + ", " + y + ")");
    }

    public void detectCollision() {
        System.out.println("Game Over");
    }

    public static void main(String[] args) {
        Dragon12 dragon = new Dragon12(5, 5, 10, 10);
    }
}
