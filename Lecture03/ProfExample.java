class Data {
    public String name;
    public int num;

    public Data(String name_, int num_) {
        name = name_;
        num = num_;
    }
}

public class ProfExample {

    public static void swapName(Data data, String name) {
        data.name = name;
    }

    public static void swapNum(Data data, int num) {
        data.num = num;
    }

    public static void swapData(Data data) {
        Data tmp = new Data("Hello", 42);
        data = tmp;
    }

    public static void main(String[] args) {
        Data d1 = new Data("Foo", 5);
        swapName(d1, "Bar");
        swapNum(d1, 10);
        System.out.println(d1.name);
        System.out.println(d1.num);
        swapData(d1);
        System.out.println(d1.name);
        System.out.println(d1.num);
    }
}