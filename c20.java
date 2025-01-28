import java.util.Random;

public class c20{
    public static void main(String[] args){
        Ball.makeBall();
        Ball.makeBall();
        Ball.makeBall();
        Ball.makeBall();
        Ball.makeBall();

        Ball.showCounter();
    }
}

class Ball{
    private double radius;
    private static int ballCounter;

    public static Ball makeBall(){
        Ball b = new Ball();
        b.radius = new Random().nextDouble(10, 20);
        ballCounter++;
        return b;
    }

    public static void showCounter(){
        System.out.println("liczba Ball: " + ballCounter);
    }
}

