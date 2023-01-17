import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

public class Fence {

    //right fence sticks
    public void fenceSticksRight(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();
        g2d.setStroke(new BasicStroke(2.2f));

        //fence stick
        Path2D.Double fenceStickRight = new Path2D.Double();
        fenceStickRight.moveTo(930, 546);
        fenceStickRight.curveTo(930, 546, 941, 562, 941, 562);
        fenceStickRight.curveTo(941, 562, 936, 671, 936, 671);
        fenceStickRight.curveTo(936, 671, 915, 671, 915, 671);
        fenceStickRight.curveTo(915, 671, 918, 561, 918, 561);
        fenceStickRight.curveTo(918, 561, 930, 546, 930, 546);



        //shadow behind fence sticks
        //shadow at top
        g2d.setColor(new Color(0,0,0, 90));
        g2d.fillRect(915, 571, 28, 18);
        //shadow at bottom
        g2d.fillRect(915, 629, 28, 18);


        //fence stick
        g2d.setColor(Color.decode("#BFB5B4"));
        g2d.fill(fenceStickRight);

        g2d.setColor(Color.decode("#E2D6D6"));
        g2d.setClip(fenceStickRight);
        g2d.translate(-5, 0);
        g2d.fill(fenceStickRight);
        g2d.setClip(null);
        g2d.setTransform(resetTransformations);
        g2d.setColor(Color.BLACK);
        g2d.draw(fenceStickRight);

        //nails in fence
        //1st nail
        g2d.setColor(Color.decode("#704525"));
        g2d.fillOval(924, 582, 5, 5);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(924, 582, 5, 5);
        //2nd nail
        g2d.setColor(Color.decode("#704525"));
        g2d.fillOval(924, 635, 5, 5);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(924, 635, 5, 5);

        //Reset transformations
        g2d.setTransform(resetTransformations);
    }

    //left fence sticks
    public void fenceSticksLeft(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();

        //fence stick for left
        Path2D.Double fenceStickLeft = new Path2D.Double();
        fenceStickLeft.moveTo(436, 546);
        fenceStickLeft.curveTo(436, 546, 448, 561, 448, 561);
        fenceStickLeft.curveTo(448, 561, 448, 671, 448, 671);
        fenceStickLeft.curveTo(448, 671, 430, 670, 430, 670);
        fenceStickLeft.curveTo(430, 670, 426, 562, 426, 562);
        fenceStickLeft.curveTo(426, 562, 436, 546, 436, 546);

        //shadow behind fence sticks
        //shadow at top

        g2d.setColor(new Color(0,0,0, 90));
        g2d.fillRect(423, 567, 28, 18);
        //shadow at bottom
        g2d.fillRect(423, 612, 28, 18);

        //fence stick
        g2d.setColor(Color.decode("#BFB5B4"));
        g2d.fill(fenceStickLeft);

        g2d.setColor(Color.decode("#E2D6D6"));
        g2d.setClip(fenceStickLeft);
        g2d.translate(-5, 0);
        g2d.fill(fenceStickLeft);
        g2d.setClip(null);
        g2d.setTransform(resetTransformations);
        g2d.setColor(Color.BLACK);
        g2d.draw(fenceStickLeft);

        //nails in fence
        //1st nail
        g2d.setColor(Color.decode("#704525"));
        g2d.fillOval(435, 570, 5, 5);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(435, 570, 5, 5);
        //2nd nail
        g2d.setColor(Color.decode("#704525"));
        g2d.fillOval(438, 621, 5, 5);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(438, 621, 5, 5);

    }

    //fence brace
    public void rightFenceBrace(Graphics2D g2d){

        //fence braces
        //first bar
        int[] xPoints1 = {890, 1137, 1137, 890};
        int[] yPoints1 = {570, 580, 601, 591};
        //2nd bar
        int[] xPoints2 = {1137, 1137, 1365, 1365 };
        int[] yPoints2 = {580, 601, 607, 588};
        //3rd bar
        int[] xPoints3 = {1365, 1365, 1497, 1497};
        int[] yPoints3 = {588, 607, 614, 595};

        g2d.setColor(Color.decode("#E2D6D6"));
        g2d.fillPolygon(xPoints1, yPoints1, xPoints1.length);
        g2d.fillPolygon(xPoints2, yPoints2, xPoints2.length);
        g2d.fillPolygon(xPoints3, yPoints3, xPoints3.length);

        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(xPoints1, yPoints1, xPoints1.length);
        g2d.drawPolygon(xPoints2, yPoints2, xPoints2.length);
        g2d.drawPolygon(xPoints3, yPoints3, xPoints3.length);

    }

    public void leftFenceBrace(Graphics2D g2d){
        //fence braces
        //first bar
        int[] xPoints1 = {461, 461, 230, 229};
        int[] yPoints1 = {572, 591, 599, 580};
        //2nd bar
        int[] xPoints2 = {229, 230, 0, 0 };
        int[] yPoints2 = {580, 599, 607, 588};

        g2d.setColor(Color.decode("#E2D6D6"));
        g2d.fillPolygon(xPoints1, yPoints1, xPoints1.length);
        g2d.fillPolygon(xPoints2, yPoints2, xPoints2.length);

        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(xPoints1, yPoints1, xPoints1.length);
        g2d.drawPolygon(xPoints2, yPoints2, xPoints2.length);
    }

    public void fenceWall(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();

        //RIGHT SIDE FENCE
        //right fence brace
        rightFenceBrace(g2d);
        g2d.translate(0, 55);
        rightFenceBrace(g2d);
        g2d.setTransform(resetTransformations);

        //draw fence sticks to make fence
        double tx = 58;
        double ty = 2;
        int rightSticksCounter = 0;

        do {
            fenceSticksRight(g2d);
            g2d.translate(tx, ty);
            rightSticksCounter++;
        }while(rightSticksCounter < 10);

        g2d.setTransform(resetTransformations);


        //LEFT SIDE FENCE
        //left fence brace
        g2d.translate(0, 13);
        leftFenceBrace(g2d);
        g2d.translate(0, 45);
        leftFenceBrace(g2d);
        g2d.setTransform(resetTransformations);

        //draw fence sticks to make fence
        g2d.translate(-5, 20);
        double tx2 = -53.2;
        double ty2 = 2;
        int leftSticksCounter = 0;

        do {
            fenceSticksLeft(g2d);
            g2d.translate(tx2, ty2);
            leftSticksCounter++;
        }while(leftSticksCounter < 11);

        g2d.setTransform(resetTransformations);
    }
}
