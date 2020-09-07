public class Entity {

    public String a = "";
    public int b;

    public Entity(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public void printInfo() {
        System.out.println("This Entity has a = " + a + " and b = " + b);
    }


}