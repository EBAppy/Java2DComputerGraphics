import java.awt.*;
import java.awt.geom.*;

public class ForeGround {


    //the main front of the house
    public void foreGround(Graphics2D g2d){
        AffineTransform resetTransformation = g2d.getTransform();
        Path2D.Double foreground = new Path2D.Double();
        Path2D.Double foregroundShadow = new Path2D.Double();

        //foreground cordinates
        foreground.moveTo(0, 670);
        foreground.curveTo(450, 640, 950,  640, 1500, 670);
        foreground.curveTo(1500, 670, 1500, 815, 1500, 815);
        foreground.curveTo(1500, 815, 0, 815, 0, 815);
        foreground.curveTo(0, 815, 0, 670, 0, 670);

        //foregroud shadow cordinates
        foregroundShadow.moveTo(0, 690);
        foregroundShadow.curveTo(165, 665,1355, 635, 810, 818);
        foregroundShadow.curveTo(810, 818, 1380, 818, 1380, 818);
        foregroundShadow.curveTo(1315, 736, 1235, 748, 1500, 710);
        foregroundShadow.curveTo(1500, 710, 1500, 695, 1500, 695);
        foregroundShadow.curveTo(1170, 645, 235, 650, 0, 690);
        foreground.closePath();

        //draw the foreground
        g2d.setColor(Color.decode("#5CB947"));
        g2d.fill(foreground);

        g2d.setColor(Color.decode("#43A02D"));
        g2d.scale(1.05, 1.05);
        g2d.translate(-45, -42);
        g2d.fill(foregroundShadow);
        g2d.setTransform(resetTransformation);
    }
}
