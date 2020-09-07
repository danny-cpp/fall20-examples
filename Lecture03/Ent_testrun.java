public class Ent_testrun {

    // Tested and any Entity object has b changed to 100.
    public static void changeNum(Entity t1) {
        t1.b = 100;
    }

    // Tested and it cannot change primitive type out of scope (expected)
    public static void changeNumPrim(int a) {
        a = 99;
    }

    // Tested and unable to change, prediction: since String attribute is immutable
    public static void changeString(Entity t1) {
        t1.a = "changed";
    }

    // Why is this function cannot access out of scope?
    public static void changePlayer(Player p1) {
        Player a_player_to_replace_input = new Player("This is new Player",
                10, 100);

        // Shouldn't this line points p1 to new_player?
        p1 = a_player_to_replace_input;
    }

    /** My question is if i want to control multiple objects like C++,
     * (eg. void myFunction(int &Obj1, double &Obj2, ...) (pass by reference),
     * how should I implement it?
     *
     * In other words, how do I change objects out of scope? Or maybe return multiple,
     * like python (eg: a, b, c = Function())
     */

    public static void main(String[] args) {


        Player p1 = new Player("unchanged", 1, 1);
        p1.printInfo();
        changePlayer(p1);
        p1.printInfo();
    }
}
