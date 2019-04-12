import java.util.Random;

public class Dice {

    public int Roll() {
        Random r = new Random();
        int a = r.nextInt(6 ) + 1;
        return a;
    }
}