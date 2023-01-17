import java.awt.*;
import java.awt.geom.AffineTransform;


public class House {
    WindowAndDoor window = new WindowAndDoor();
    Roof roof = new Roof();
    ChimneyAndVent chimneyAndVent = new ChimneyAndVent();
    Flowers flower = new Flowers();

    Fence fence = new Fence();

    public void drawAllHouses(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();

        g2d.translate(-16, 0);
        house1(g2d);
        house2(g2d);
        g2d.setTransform(resetTransformations);
        house3(g2d);
    }

    //HOUSE 1: storey house
    public void house1(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();

        //wooden veranda on house1
        g2d.setColor(Color.decode("#866E42"));
        g2d.fillRect(450, 236, 8, 153);
        g2d.setStroke(new BasicStroke(1f));
        g2d.setColor(Color.BLACK);
        g2d.drawRect(450, 236, 8, 153);

        //horizontal and vert bars
        //vert bars
        g2d.setColor(Color.decode("#866E42"));
        g2d.fillRect(397, 316, 8, 70);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(397, 316, 8, 70);

        g2d.setColor(Color.decode("#866E42"));
        g2d.fillRect(415, 316, 8, 70);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(415, 316, 8, 70);

        g2d.setColor(Color.decode("#866E42"));
        g2d.fillRect(432, 316, 10, 70);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(432, 316, 8, 70);

        //horizontal bars
        g2d.setColor(Color.decode("#866E42"));
        g2d.fillRect(387, 302, 89, 14);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(387, 302, 89, 14);

        g2d.setColor(Color.decode("#866E42"));
        g2d.fillRect(387, 375, 89, 14);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(387, 375, 89, 14);

        //wall of house1
        g2d.setStroke(new BasicStroke(1.5f));
        g2d.setColor(Color.decode("#DEDFE1"));
        g2d.fillRect(110, 241, 292, 149);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(110, 241, 292, 149);

        //shadow below roof
        g2d.setColor(new Color(0,0,0, 80));
        int[] xPoints1 = {109, 403, 403, 109};
        int[] yPoints1 = {241, 243, 256, 257};
        g2d.fillPolygon(xPoints1, yPoints1, xPoints1.length);


        //draw window for house 1
        g2d.translate(0, 0);
        window.window1(g2d, "#966A3B");
        g2d.translate(130, 0);
        window.window1(g2d, "#966A3B");
        g2d.setTransform(resetTransformations);

        //draw roof for house 1
        g2d.setStroke(new BasicStroke(1.5f));
        roof.drawRoof1(g2d);
        g2d.setTransform(resetTransformations);

    }

    //HOUSE 2
    public void house2(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();

        //wall behind house 2 and house 3
        g2d.setColor(Color.decode("#DEDFE1"));
        g2d.fillRect(87, 477, 478, 203);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(87, 477, 478, 203);

        //wall of house 2
        g2d.setStroke(new BasicStroke(1.5f));
        g2d.setColor(Color.decode("#DEDFE1"));
        g2d.fillRect(110, 465, 350, 200);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(110, 465, 350, 200);

        //shadow below roof of house 2
        g2d.setColor(new Color(0,0,0, 80));
        int[] xPoints1 = {110, 460, 460, 110};
        int[] yPoints1 = {492, 484, 510, 514};
        g2d.fillPolygon(xPoints1, yPoints1, xPoints1.length);

        //window for house2
        g2d.translate(-27, 258);
        window.window1(g2d, "#EA843C");
        g2d.translate(245, 0);
        window.window1(g2d, "#EA843C");
        g2d.setTransform(resetTransformations);

        //vent at the side of house
        chimneyAndVent.drawVent(g2d);

        //roof for house2
        g2d.translate(8, 243);
        g2d.setStroke(new BasicStroke(1.5f));
        roof.drawRoof1(g2d);
        g2d.setTransform(resetTransformations);

        //draw front porch
        g2d.scale(0.60, 0.72);
        g2d.translate(-212, 255);
        roof.drawFrontPorch(g2d);
        //small white rectangle on roof
        int[] xPoints = {586, 686, 780};
        int[] yPoints = {438, 363, 438};
        g2d.setColor(Color.decode("#FFFFFF"));
        g2d.fillPolygon(xPoints, yPoints, xPoints.length);
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(xPoints, yPoints, xPoints.length);
        g2d.setTransform(resetTransformations);


        //door for house2
        window.door1(g2d);

        //draw the flowers on right
        g2d.scale(0.9, 0.9);
        g2d.translate(-50, 130);
        flower.flower(g2d, "#358316", "#6CAB43");

        g2d.scale(0.6, 0.6);
        g2d.translate(400, 380);
        flower.flower(g2d, "#90B60B", "#D2DC25");

        //draw second flowers on the left
        g2d.translate(-970, -390);
        g2d.scale(1.7, 1.7);
        flower.flower(g2d, "#358316", "#6CAB43");
        g2d.scale(0.6, 0.6);
        g2d.translate(400, 400);
        flower.flower(g2d, "#90B60B", "#D2DC25");


        g2d.setTransform(resetTransformations);
    }

    //HOUSE 3
    public void house3(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();

        //draw chimney
        g2d.scale(1.17, 1.15);
        g2d.translate(-145, -28);
        chimneyAndVent.drawChimney(g2d);
        g2d.setTransform(resetTransformations);

        //draw wall
        g2d.setColor(Color.decode("#BEBFC1"));
        g2d.fillRect(452, 402, 432, 288);
        g2d.setStroke(new BasicStroke(1.7f));
        g2d.setColor(Color.BLACK);
        g2d.drawRect(452, 402, 432, 288);

        //draw roof for house3
        g2d.translate(-10, 10);
        roof.drawRoof3(g2d);
        g2d.setTransform(resetTransformations);

        //draw porch roof shadow
        //@TODO fix the roof shadow
        roof.drawPorchRoofShadow(g2d);

        //DRAW FENCE WALLS

        //make sticks come up a bit
        g2d.translate(0, -10);
        fence.fenceWall(g2d);
        g2d.setTransform(resetTransformations);

        //draw flower in front of the house
        g2d.translate(-5, -12);
        flower.flowerPot(g2d);
        g2d.translate(-343, 0);
        flower.flowerPot(g2d);
        g2d.setTransform(resetTransformations);

        //draw front porch
        g2d.setStroke(new BasicStroke(2f));
        g2d.translate(-17, 0);
        roof.drawFrontPorch(g2d);

        //draw door
        window.door2(g2d);

        //draw window
        window.window2(g2d);
        g2d.translate(335, 0);
        window.window2(g2d);
        g2d.setTransform(resetTransformations);

        g2d.setTransform(resetTransformations);

    }
}
