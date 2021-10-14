import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 700;
    public static int A = 0;
    public static int b = 0;
    public static int c = 0;
    public static int d = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {

        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(A, HEIGHT * 1 / 5, 15, 15);
        A++;
    }

    private void drawCircle2() {
        ellipse(b, HEIGHT * 2 / 5, 15, 15);
        b = b + 2;
    }

    private void drawCircle3() {
        ellipse(c, HEIGHT * 3 / 5, 15, 15);
        c = c + 5;
    }

    private void drawCircle4() {
        ellipse(d, HEIGHT * 4 / 5, 15, 15);
        d = d + 7;
    }
}
