public class Player extends Entity {

    int score = 0;

    public Player(String a, int b, int score) {
        super(a, b);
        this.score = score;
    }

    @Override
    public void printInfo() {
        System.out.println("Name is " + a);
    }
}
