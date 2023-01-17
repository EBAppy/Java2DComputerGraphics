import java.awt.*;
import java.awt.geom.*;

public class Mountain {

    //method to draw the mountain1
    public void drawMountain1(Graphics2D g2d){

        Path2D.Double mountainOutline = new Path2D.Double();
        Path2D.Double mountainShadow1 = new Path2D.Double();
        Path2D.Double mountainShadow2 = new Path2D.Double();

        mountainOutline.moveTo(0, 500);
        mountainOutline.curveTo(110, 0, 264, -150, 400, 500);
        mountainOutline.closePath();

        g2d.setStroke(new BasicStroke(2f));
        g2d.setColor(Color.decode("#489000"));
        g2d.fill(mountainOutline);
        g2d.setColor(Color.BLACK);
        g2d.draw(mountainOutline);

        //draw shadow of mountain1
        Path2D.Double mountainShadow = new Path2D.Double();
        mountainShadow.moveTo(79, 207);
        mountainShadow.curveTo(10, 500, 85, 400, 170, 222);
        mountainShadow.curveTo(154, 222, 79, 207, 79, 207);
        g2d.setColor(Color.decode("#6FB900"));
        //g2d.setColor(Color.BLACK);
        g2d.fill(mountainShadow);
    }

    //draw mountain 2
    public void drawMountain2(Graphics2D g2d){
        Path2D.Double mountainOutline = new Path2D.Double();
        Path2D.Double mountainShadow1 = new Path2D.Double();
        Path2D.Double mountainShadow2 = new Path2D.Double();
        Path2D.Double mountainShadow3 = new Path2D.Double();
        Path2D.Double mountainShadow4 = new Path2D.Double();

        mountainOutline.moveTo(0, 500);
        mountainOutline.curveTo(110, 0, 264, -150, 400, 500);
        mountainOutline.closePath();

        //draw the main mountain
        g2d.setStroke(new BasicStroke(2f));
        g2d.setColor(Color.decode("#6FB900"));
        g2d.fill(mountainOutline);
        g2d.setColor(Color.BLACK);
        g2d.draw(mountainOutline);
    }

    //draw mountain 3 (shadow of mountain 2)_
    public void drawMountain3(Graphics2D g2d){
        Path2D.Double mountainOutline = new Path2D.Double();

        mountainOutline.moveTo(0, 500);
        mountainOutline.curveTo(110, 0, 264, -150, 400, 500);
        mountainOutline.closePath();

        //draw the main mountain
        g2d.setStroke(new BasicStroke(2f));
        g2d.setColor(Color.decode("#549B01"));
        g2d.fill(mountainOutline);
    }


    //draw the yellow mountain high land
    public void drawMountainGround(Graphics2D g2d){
        Path2D.Double mountainOutline = new Path2D.Double();

        mountainOutline.moveTo(0, 520);
        mountainOutline.curveTo(430, 332, 890, 470, 1500, 580);
        mountainOutline.curveTo(1500, 520, 1500, 818, 1500, 818);
        mountainOutline.curveTo(1500, 818, 0, 818, 0, 818);
        mountainOutline.curveTo(0, 818, 0, 520, 0, 520);

        //draw the main mountain
        g2d.setStroke(new BasicStroke(2f));
        g2d.setColor(Color.decode("#BBD431"));
        g2d.fill(mountainOutline);
        g2d.setColor(Color.BLACK);
        g2d.draw(mountainOutline);
    }

}
