import processing.core.PApplet;

public class BallRollingOops extends PApplet {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public float speed1 = 1;
    public float speed2 = 2;
    public float speed3 = 3;
    public float speed4 = 4;

    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;

    public static void main(String[] args){ PApplet.main("BallRollingOops",args);}

    @Override
    public void settings() {
        super.settings();

        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new Ball(10,10,speed1,HEIGHT/5);
        ball2 = new Ball(10,10,speed2,2*HEIGHT/5);
        ball3 = new Ball(10,10,speed3,3*HEIGHT/5);
        ball4 = new Ball(10,10,speed4,4*HEIGHT/5);
    }

    @Override
    public void draw() {

        ball1.move();
        ball2.move();
        ball3.move();
        ball4.move();

        ball1.show(this);
        ball2.show(this);
        ball3.show(this);
        ball4.show(this);
    }

}

