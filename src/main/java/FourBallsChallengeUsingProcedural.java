
import processing.core.PApplet;

public class FourBallsChallengeUsingProcedural extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int RADIUS = 10;
    public static final int noOfBalls = 4;
    float[] positionX = new float[noOfBalls];

    public static void main(String[] args) {
        PApplet.main("FourBallsChallengeUsingProcedural",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        for (int i = 0; i < noOfBalls; i++) {
            drawCircle(positionX[i],HEIGHT * (i+1) / 5, RADIUS);
            positionX[i]+=(i+1);
        }
    }

    private void drawCircle(float xValue,float yValue,float RADIUS) {
        ellipse(xValue,yValue,RADIUS,RADIUS);
    }
}

