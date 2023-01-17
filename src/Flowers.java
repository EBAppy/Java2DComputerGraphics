import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

public class Flowers {

    //draw flower pot
    public void flowerPot(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();

        //draw the flower
        g2d.scale(0.9, 0.9);
        g2d.translate(430, 72);
        flower(g2d, "#358316", "#6CAB43");
        g2d.setTransform(resetTransformations);

        //small top of the flower pot
        g2d.setStroke(new BasicStroke(1.5F));
        g2d.setColor(Color.decode("#FBB464"));
        g2d.fillRect(800, 606, 95, 66);
        g2d.setColor(Color.decode("#C09495"));
        g2d.fillRect(800, 606, 95, 9);

        //draw outline of pot
        g2d.setColor(Color.BLACK);
        g2d.drawRect(800, 606, 95, 9);
        g2d.drawRect(800, 606, 95, 66);

        //put decorations on flower pot
        flowerPotDecor(g2d);
        g2d.setTransform(resetTransformations);
    }

    //draw flower
    public void flower(Graphics2D g2d, String mainColor, String shadowColor){
        AffineTransform resetTransformations = g2d.getTransform();

        Path2D.Double flowerPlant = new Path2D.Double();
        flowerPlant.moveTo(465, 615);
        flowerPlant.curveTo(455, 619, 451, 612, 461, 605);
        flowerPlant.curveTo(449, 601, 456, 592, 462, 596);
        flowerPlant.curveTo(459, 592, 460, 590, 465, 591);
        flowerPlant.curveTo(457, 585, 461, 583, 470, 583);
        flowerPlant.curveTo(461, 571, 465, 568, 472, 577);
        flowerPlant.curveTo(471, 562, 474, 561, 477, 570);
        flowerPlant.curveTo(473, 559, 477, 556, 482, 565);
        flowerPlant.curveTo(495, 551, 496, 550, 495, 562);
        flowerPlant.curveTo(503, 551, 505, 553, 507, 557);
        flowerPlant.curveTo(502, 546, 505, 543, 510, 555);
        flowerPlant.curveTo(515, 545, 521, 546, 519, 555);
        flowerPlant.curveTo(534, 547, 537, 552, 532, 557);//new point here
        flowerPlant.curveTo(541, 551, 546, 554, 542, 560);
        flowerPlant.curveTo(547, 554, 549, 556, 547, 563);
        flowerPlant.curveTo(552, 556, 556, 561, 552, 565);
        flowerPlant.curveTo(559, 566, 559, 569, 555, 572);
        flowerPlant.curveTo(565, 572, 567, 581, 557, 582);
        flowerPlant.curveTo(568, 587, 566, 592, 562, 592);
        flowerPlant.curveTo(568, 598, 569, 601, 563, 602);
        flowerPlant.curveTo(567, 602, 567, 606, 563, 606);
        flowerPlant.curveTo(568, 608, 565, 611, 563, 609);
        flowerPlant.curveTo(563, 609, 465, 615, 465, 615);


        //draw the flower
        g2d.setStroke(new BasicStroke(2f));
        g2d.setColor(Color.decode(mainColor));
        g2d.fill(flowerPlant);
        g2d.setColor(Color.BLACK);
        g2d.draw(flowerPlant);

        //draw shadow in plant
        g2d.setClip(flowerPlant);
        g2d.setColor(Color.decode(shadowColor));
        g2d.scale(0.8, 0.8);
        g2d.translate(130, 155);
        g2d.fill(flowerPlant);
        g2d.setClip(null);
        g2d.setTransform(resetTransformations);
    }

    //flower pot decor
    public void flowerPotDecor(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();
        g2d.setStroke(new BasicStroke(20f));

        Path2D.Double stone1 = new Path2D.Double();
        stone1.moveTo(110, 9);
        stone1.curveTo(16, 14, 7, 98, 29, 165);
        stone1.curveTo(47, 218, 95, 286, 171, 261);
        stone1.curveTo(269, 225, 299, 120, 199, 38);
        stone1.curveTo(176, 19, 140, 7, 108, 10);


        Path2D.Double stone2 = new Path2D.Double();
        stone2.moveTo(344, 115);
        stone2.curveTo(345, 184, 401, 203, 216, 252);
        stone2.curveTo(78, 291, 6, 153, 97, 59);
        stone2.curveTo(123, 30, 137, 20, 186, 14);
        stone2.curveTo(260, 7, 346, 39, 345, 116);


        //set scale for decoration
        g2d.scale(0.085, 0.085);
        g2d.translate(9500, 7400);

        //stone 2
        g2d.translate(-100, 0);
        g2d.setColor(Color.decode("#BEBFC1"));
        g2d.fill(stone2);
        g2d.setColor(Color.BLACK);
        g2d.draw(stone2);

        //stone 1
        g2d.translate(650, 70);
        g2d.setColor(Color.decode("#BEBFC1"));
        g2d.fill(stone1);
        g2d.setColor(Color.BLACK);
        g2d.draw(stone1);

        //stone 1
        g2d.scale(0.7, 0.7);
        g2d.translate(350, -80);
        g2d.setColor(Color.decode("#BEBFC1"));
        g2d.fill(stone1);
        g2d.setColor(Color.BLACK);
        g2d.draw(stone1);

        //stone 2
        g2d.scale(0.7, 0.7);
        g2d.translate(-1000, -80);
        g2d.setColor(Color.decode("#BEBFC1"));
        g2d.fill(stone2);
        g2d.setColor(Color.BLACK);
        g2d.draw(stone2);

        //stone 1
        g2d.scale(1.5, 1.5);
        g2d.translate(30, 200);
        g2d.setColor(Color.decode("#BEBFC1"));
        g2d.fill(stone1);
        g2d.setColor(Color.BLACK);
        g2d.draw(stone1);

        //stone 2
        g2d.scale(0.80, 0.80);
        g2d.translate(250, -390);
        g2d.setColor(Color.decode("#BEBFC1"));
        g2d.fill(stone2);
        g2d.setColor(Color.BLACK);
        g2d.draw(stone2);

        g2d.setTransform(resetTransformations);
    }
}
