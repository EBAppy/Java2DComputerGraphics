import java.awt.*;
import java.awt.geom.AffineTransform;

public class WindowAndDoor {

    //draw window
    public void window1(Graphics2D g2d, String windowColor){

        AffineTransform resetTransformations = g2d.getTransform();
        g2d.setStroke(new BasicStroke(2f));
        //windows
        g2d.setColor(Color.decode(windowColor));
        g2d.fillRect(154, 268, 72, 71);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(154, 268, 72, 71);

        //small square on top left
        g2d.setColor(Color.decode("#BEEBFF"));
        g2d.fillRect(161, 275, 25, 25);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(161, 275, 25, 25);
        //blue reflection in window to give glass effect
        g2d.setColor(Color.decode("#50CBF7"));
        g2d.drawRect(164, 277, 20, 21);

        //small square bottom right side of window
        g2d.translate(0, 31);
        g2d.setColor(Color.BLACK);
        g2d.setColor(Color.decode("#BEEBFF"));
        g2d.fillRect(161, 275, 25, 25);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(161, 275, 25, 25);
        //blue reflection in window to give glass effect
        g2d.setColor(Color.decode("#50CBF7"));
        g2d.drawRect(164, 277, 20, 21);
        g2d.setTransform(resetTransformations);

        //small square on top right
        g2d.translate(33, 0);
        g2d.setColor(Color.BLACK);
        g2d.setColor(Color.decode("#BEEBFF"));
        g2d.fillRect(161, 275, 25, 25);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(161, 275, 25, 25);
        //blue reflection in window to give glass effect
        g2d.setColor(Color.decode("#50CBF7"));
        g2d.drawRect(164, 277, 20, 21);

        //small square on bottom right
        g2d.translate(0, 31);
        g2d.setColor(Color.BLACK);
        g2d.setColor(Color.decode("#BEEBFF"));
        g2d.fillRect(161, 275, 25, 25);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(161, 275, 25, 25);
        //blue reflection in window to give glass effect
        g2d.setColor(Color.decode("#50CBF7"));
        g2d.drawRect(164, 277, 20, 21);
        g2d.setTransform(resetTransformations);
    }

    //draw door
    public void door1(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();

        g2d.setStroke(new BasicStroke(1.5f));
        g2d.setColor(Color.decode("#EA843C"));
        g2d.fillRect(247, 535, 80, 300);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(247, 535, 80, 300);
        //door inner line
        g2d.drawRect(251, 540, 69, 300);

        //door glass
        g2d.translate(8, 16);
        g2d.setColor(Color.decode("#C6E9F8"));
        g2d.fillRect(250, 537, 53, 25);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(250, 537, 53, 25);
        g2d.setTransform(resetTransformations);
    }

    public void door2(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();

        //door frame
        g2d.setStroke(new BasicStroke(2f));
        g2d.setColor(Color.decode("#9C693E"));
        g2d.fillRect(624, 479, 120, 191);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(624, 479, 120, 191);

        //door
        g2d.setColor(Color.decode("#763D2C"));
        g2d.fillRect(633, 491, 103, 486);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(633, 491, 103, 486);

        g2d.setColor(Color.decode("#763D2C"));
        g2d.fillRect(633, 491, 103, 486);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(636, 494, 97, 486);

        //door brown glass
        g2d.drawRect(650, 518, 70, 39);
        g2d.scale(0.9, 0.82);
        g2d.translate(76, 117.9);
        g2d.drawRect(650, 518, 70, 39);
        g2d.setTransform(resetTransformations);

        //door handle
        g2d.setColor(Color.WHITE);
        g2d.fillOval(642, 579, 17, 17);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(642, 579, 17, 17);

        g2d.setColor(Color.decode("#763D2C"));
        g2d.fillOval(648, 585, 5, 5);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(648, 585, 5, 5);
    }

    //window 2
    public void window2(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();

        //window frame
        g2d.setColor(Color.decode("#966D38"));
        g2d.fillRect(497, 469, 42, 71);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(497, 469, 42, 71);

        //small rect on top
        g2d.setColor(Color.decode("#C4E9FB"));
        g2d.fillRect(502, 474, 32, 28);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(502, 474, 32, 28);
        //small blue square for glass effect
        g2d.setColor(Color.decode("#50CBF7"));
        g2d.drawRect(504, 476, 28, 24);


        //small rect at bottom
        g2d.translate(0, 33);
        g2d.setColor(Color.decode("#C4E9FB"));
        g2d.fillRect(502, 474, 32, 28);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(502, 474, 32, 28);
        //small blue square for glass effect
        g2d.setColor(Color.decode("#50CBF7"));
        g2d.drawRect(504, 476, 28, 24);

        g2d.setTransform(resetTransformations);
    }
}
