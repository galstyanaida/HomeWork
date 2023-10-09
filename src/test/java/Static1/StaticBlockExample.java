package Static1;

public class StaticBlockExample {
    static {
        System.out.println("Static block is invoked");
    }

    public static void main(String [] args){
        System.out.print("Main method ");
        StaticBlockExample example = new StaticBlockExample();
        System.out.print("Main method");
    }
}
