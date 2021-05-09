import processing.core.PApplet;

public class Ball {
    private float height;
    private float width;
    private float speed;
    private float ballHeightFromTop;
    private int x = 1;


    Ball(float width, float height,float speed,float ballHeightFromTop ){
        this.width = width;
        this.height = height;
        this.ballHeightFromTop = ballHeightFromTop;
        this.speed = speed;
    }

    public void move(){
        x += speed;
    }

    public void show(PApplet pApplet) {
        pApplet.ellipse(x, ballHeightFromTop, height, width);

    }
}
