package Static2;

public class Start {
    public static void main(String[] args) {
        StaticExample example1 = new StaticExample();
        System.out.println("Counter example1: " + StaticExample.getCounter());
        StaticExample example2 = new StaticExample();
        System.out.println("Counter example2: " + StaticExample.getCounter());

    }
}
