import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

public class ChimneyAndVent {

    //vent on house 2
    public void drawVent(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();

        Path2D.Double vent = new Path2D.Double();
        vent.moveTo(86, 479);
        vent.curveTo(86, 479, 86, 561, 86, 561);
        vent.curveTo(86, 561, 76, 578, 76, 578); //lin3 point1
        vent.curveTo(76, 578, 86, 590, 86, 590);
        vent.curveTo(86, 590, 98, 563, 98, 563); //line3 point2
        vent.curveTo(98, 563, 98, 479, 98, 479);
        vent.curveTo(98, 479, 86, 479, 86, 479);

        g2d.setColor(Color.decode("#8E8F93"));
        g2d.fill(vent);
        g2d.setColor(Color.BLACK);

        g2d.setClip(vent);
        g2d.translate(-6, 0);
        g2d.setColor(Color.WHITE);
        g2d.fill(vent);
        g2d.setTransform(resetTransformations);

        //lines in vent
        g2d.setColor(Color.BLACK);
        g2d.drawLine(80, 516, 101, 516);
        g2d.drawLine(79, 543, 103, 543);
        g2d.drawLine(82, 559, 103, 563);
        g2d.setClip(null);
        g2d.draw(vent);

    }

    //chimney on house 3
    public void drawChimney(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();
        g2d.setStroke(new BasicStroke(2f));

        Path2D.Double chimneyTop = new Path2D.Double();
        chimneyTop.moveTo(897, 214);
        chimneyTop.curveTo(897, 214, 921, 181, 921, 181);
        chimneyTop.curveTo(921, 181, 951, 214, 951, 214);
        chimneyTop.curveTo(951, 214, 897, 214, 897, 214);

        //fill the top shape
        g2d.setClip(chimneyTop);
        g2d.setColor(Color.decode("#56829D"));
        g2d.fillRect(895, 179, 30, 40);
        g2d.setColor(Color.decode("#93B6C9"));
        g2d.fillRect(920, 179, 30, 40);
        g2d.setClip(null);


        //rect 1 below from below top triangle
        g2d.setColor(Color.decode("#79889D"));
        g2d.fillRect(909, 214, 27, 16);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(909, 214, 27, 16);
        //shadow in rect
        g2d.setColor(new Color(0,0,0,90));
        g2d.setClip(909, 214, 27, 16);
        g2d.fillRect(909, 214, 27, 6);
        g2d.setClip(null);


        //rest of body segment
        Path2D.Double chimneybottom = new Path2D.Double();
        chimneybottom.moveTo(911, 232);
        chimneybottom.curveTo(911, 232, 910, 300, 910, 300);
        chimneybottom.curveTo(913, 309, 903, 314, 898, 311);
        chimneybottom.curveTo(898, 311, 904, 336, 904, 336);
        chimneybottom.curveTo(921, 338, 932, 336, 934, 301);
        chimneybottom.curveTo(934, 301, 935, 232, 935, 232);
        chimneybottom.curveTo(935, 232, 911, 232, 911, 232);


        //fill with colour to colour the chimney
        g2d.setColor(Color.decode("#9AABC7"));
        g2d.fill(chimneybottom);

        //color inside chimney: first half
        g2d.setClip(chimneybottom);
        g2d.setColor(Color.decode("#47617C"));
        g2d.translate(-13, -10);
        g2d.fill(chimneybottom);

        g2d.setClip(null);
        g2d.setTransform(resetTransformations);

        //draw outline of the chimney
        g2d.setColor(Color.BLACK);
        g2d.draw(chimneybottom);


        //rect 2 at the top of the chimney: small rect
        g2d.setColor(Color.decode("#93B6C9"));
        g2d.fillRect(903, 227, 38, 7);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(903, 227, 38, 7);

        //draw lines in the chimney and small circles (for screws)
        //lines
        g2d.setClip(chimneybottom);
        g2d.setColor(Color.BLACK);
        g2d.drawLine(908, 251, 937, 252);
        g2d.drawLine(908, 273, 937, 275);
        g2d.drawLine(909, 304, 936, 307);
        //circles
        g2d.fillOval(913, 246, 3, 3);
        g2d.fillOval(921, 246, 3, 3);
        g2d.fillOval(929, 246, 3, 3);

        g2d.fillOval(913, 298, 3, 3);
        g2d.fillOval(922, 299, 3, 3);
        g2d.fillOval(929, 300, 3, 3);


        //fill base shape of chimney: small brown part of chimney
        int[] xPoints = {891, 904, 916, 896};
        int[] yPoints = {310, 305, 338, 340};
        g2d.setColor(Color.decode("#4C5566"));
        g2d.fillPolygon(xPoints, yPoints, xPoints.length);
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(xPoints, yPoints, xPoints.length);

        g2d.setClip(null);

        //draw outline of chimney bottom
        g2d.setColor(Color.BLACK);
        g2d.draw(chimneyTop);

        g2d.setTransform(resetTransformations);
    }
}

