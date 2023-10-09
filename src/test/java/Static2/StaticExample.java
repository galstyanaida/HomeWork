package Static2;

public class StaticExample {
    static int counter=0;

    StaticExample(){
        counter++;
    }

    static int getCounter(){
        return counter;
    }
}
