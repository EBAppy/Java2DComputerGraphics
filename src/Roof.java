import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.image.AffineTransformOp;
import java.nio.file.Path;

public class Roof {

    //roof artifact(tile) for house 1 and house 2
    public void roofTile(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();


        //NEW CODE 2
        Path2D.Double tile = new Path2D.Double();
        tile.moveTo(76, 203);
        tile.curveTo(79, 194, 99, 194, 101, 205);

        g2d.rotate(-0.02, 76, 202);
        g2d.scale(1.02, 1);
        g2d.translate(-2, 0);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(1.5f));

        //draw curves for the roof
        int tileCounter = 0;
        double tx = 25.5;
        double ty = 0;
        do {
            g2d.draw(tile);
            g2d.translate(tx, ty);
            tileCounter++;
        } while(tileCounter < 20);

        g2d.setTransform(resetTransformations);
    }

    //roof for house 1 and house 2
    //draw roof
    public void drawRoof1 (Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();

        //set clip for roof and to serve as roof boundary
        Path2D.Double roofClip = new Path2D.Double();
        roofClip.moveTo(87, 156);
        roofClip.curveTo(87, 156, 453, 151, 453, 151);
        roofClip.curveTo(453, 151, 476, 242, 476, 242);
        roofClip.curveTo(476, 242, 65, 248, 65, 248);
        roofClip.curveTo(65, 248, 87, 156, 87, 156);

        //draw roof
        g2d.setColor(Color.decode("#F83545"));
        g2d.fill(roofClip);
        g2d.draw(roofClip);

        //small rectangle at top of roof
        int[] xPoints1 = {86, 86, 451, 452};
        int[] yPoints1 = {156, 145, 140, 150};
        g2d.setStroke(new BasicStroke(1.8f));
        g2d.setColor(Color.decode("#F83545"));
        g2d.fillPolygon(xPoints1, yPoints1, xPoints1.length);
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(xPoints1, yPoints1, xPoints1.length);


        //draw the tiles on the roof
        g2d.setClip(roofClip);
        g2d.rotate(0.005, 476, 242);

        //middle curves
        roofTile(g2d);

        //line3
        g2d.scale(1.0255, 1);
        g2d.translate(-6.2, 25);
        roofTile(g2d);

        //line4: first edge curves
        g2d.scale(1.0255, 1);
        g2d.translate(-6.9, 20);
        roofTile(g2d);

        //line5: second edge curves
        g2d.translate(0, 4);
        roofTile(g2d);

        //line2
        g2d.scale(0.92, 0.92);
        g2d.translate(23, -60);
        roofTile(g2d);

        //line1
        //g2d.rotate();
        g2d.scale(0.98, 0.97);
        g2d.translate(6, -12);
        roofTile(g2d);

        //reset clip and transformation
        g2d.setClip(null);
        g2d.setTransform(resetTransformations);
        g2d.draw(roofClip);

        //straight lines through curve intersections
        g2d.setStroke(new BasicStroke(1.8f));
        g2d.setClip(roofClip);
        g2d.drawLine(90, 257, 114, 146);
        g2d.drawLine(118, 257, 138, 146);
        g2d.drawLine(146, 257, 162, 146);
        g2d.drawLine(173, 257, 187, 146);
        g2d.drawLine(200, 257, 211, 146);
        g2d.drawLine(228, 257, 235, 146);
        g2d.drawLine(256, 257, 259, 146);
        g2d.drawLine(284, 257, 283, 146);
        g2d.drawLine(311, 257, 307, 146);
        g2d.drawLine(339, 257, 331, 146);
        g2d.drawLine(367, 257, 356, 146);
        g2d.drawLine(395, 257, 380, 146);
        g2d.drawLine(423, 257, 405, 146);
        g2d.drawLine(451, 257, 428, 146);
        g2d.setClip(null);

        //shade
        //Shade Clip
        Path2D.Double roofShadeClip = new Path2D.Double();
        roofShadeClip.moveTo(80, 237);
        roofShadeClip.curveTo(87, 237, 89, 237, 93, 247);
        roofShadeClip.curveTo(93, 247, 113, 147, 113, 149);
        roofShadeClip.curveTo(113, 149, 100, 139, 100, 139);
        roofShadeClip.curveTo(100, 139, 80, 237, 80, 237);

        g2d.setClip(roofClip);
        g2d.setColor(new Color(0, 0, 0, 130));

        g2d.translate(0, 2.3);
        g2d.fill(roofShadeClip);//first shade

        g2d.translate(26, 0);
        g2d.fill(roofShadeClip);//second shade

        g2d.rotate(-0.035, 144, 247);
        g2d.translate(27.5, -1);
        g2d.fill(roofShadeClip);//3rd shade

        g2d.rotate(-0.035, 144, 247);
        g2d.translate(27.5, -1);
        g2d.fill(roofShadeClip);//4th shade

        g2d.rotate(-0.035, 144, 247);
        g2d.translate(27.5, -1);
        g2d.fill(roofShadeClip);//5th shade

        g2d.rotate(-0.035, 144, 247);
        g2d.translate(27.5, 3);
        g2d.fill(roofShadeClip);//6th shade

        g2d.rotate(-0.017, 144, 247);
        g2d.translate(27.5, 2);
        g2d.fill(roofShadeClip);//7th shade

        g2d.rotate(-0.03, 144, 247);
        g2d.translate(27.5, 4);
        g2d.fill(roofShadeClip);//8th shade

        g2d.rotate(-0.03, 144, 247);
        g2d.translate(25.5, 2);
        g2d.fill(roofShadeClip);//9th shade

        g2d.rotate(-0.03, 144, 247);
        g2d.translate(26, 4.5);
        g2d.fill(roofShadeClip);//10th shade

        g2d.rotate(-0.03, 144, 247);
        g2d.translate(26.9, 4.5);
        g2d.fill(roofShadeClip);//11th shade

        g2d.rotate(-0.03, 144, 247);
        g2d.translate(26.9, 7);
        g2d.fill(roofShadeClip);//12th shade

        g2d.rotate(-0.039, 144, 247);
        g2d.translate(26.9, 7);
        g2d.fill(roofShadeClip);//13th shade

        g2d.rotate(-0.039, 144, 247);
        g2d.translate(25.5, 7.5);
        g2d.fill(roofShadeClip);//14th shade

        g2d.rotate(-0.039, 144, 247);
        g2d.translate(25, 8.9);
        g2d.fill(roofShadeClip);//15th shade

        g2d.setClip(null);
        g2d.setTransform(resetTransformations);
    }


    //draw for house 3
    public void drawRoof3(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();
        //roof of house 3
        Path2D.Double roof3 = new Path2D.Double();
        roof3.moveTo(476, 256);
        roof3.curveTo(476, 256, 874, 256, 874, 256);
        roof3.curveTo(874, 256, 926, 410, 926, 410);
        roof3.curveTo(926, 410, 428, 410, 428, 410);
        roof3.curveTo(428, 410, 476, 256, 476, 256);
        g2d.setColor(Color.decode("#ED1844"));
        g2d.fill(roof3);
        g2d.setColor(Color.BLACK);
        g2d.draw(roof3);

        //roof3 lines
        g2d.setClip(roof3);
        int[] xPoints2 = {424, 460, 469, 467, 505, 508, 510, 564, 569, 571, 663, 666, 670, 698, 696, 704, 760,
                765, 767,    796, 797, 801, 837, 838, 843, 875, 878,
                882, 930};
        int[] yPoints2 = {402, 402, 387, 402, 402, 383, 403, 403, 390, 400, 400, 381, 400, 400, 385, 402, 402,
                383, 400,    400, 387, 400, 400, 390, 400, 400, 383,
                401, 401};
        g2d.drawPolyline(xPoints2, yPoints2, xPoints2.length);
        g2d.translate(5, -36);
        g2d.drawPolyline(xPoints2, yPoints2, xPoints2.length);
        g2d.translate(0, -36);
        g2d.drawPolyline(xPoints2, yPoints2, xPoints2.length);
        g2d.translate(30, -33);
        g2d.drawPolyline(xPoints2, yPoints2, xPoints2.length);
        g2d.setClip(null);
        g2d.setTransform(resetTransformations);

        //roof3 topmost cover
        Path2D.Double roofTop = new Path2D.Double();
        roofTop.moveTo(467, 272);
        roofTop.curveTo(467, 272, 883, 272, 883, 272);
        roofTop.curveTo(883, 272, 871, 246, 871, 246);
        roofTop.curveTo(871, 246, 479, 246, 479, 246);
        roofTop.curveTo(479, 246, 467, 272, 467, 272);
        g2d.setColor(Color.decode("#A20F2B"));
        g2d.fill(roofTop);
        //inner top red coloration on topmost part of roof 3
        g2d.setClip(roofTop);
        g2d.translate(0, -15);
        g2d.setColor(Color.decode("#FF0B38"));
        g2d.fill(roofTop);
        g2d.setTransform(resetTransformations);
        g2d.setClip(null);
        //draw outline of rooftop
        g2d.setColor(Color.BLACK);
        g2d.draw(roofTop);

        //white reflection on roof3
        Path2D.Double roofReflection = new Path2D.Double();
        g2d.translate(7, 0);
        g2d.setColor(new Color(255, 255, 255, 180));
        roofReflection.moveTo(440, 398);
        roofReflection.curveTo(440, 398, 475, 283, 475, 283);
        roofReflection.curveTo(475, 283, 748, 278, 748, 278);
        roofReflection.curveTo(748, 278, 469, 276, 469, 276);
        roofReflection.curveTo(469, 276, 440, 398, 440, 398);
        g2d.fill(roofReflection);
        g2d.setTransform(resetTransformations);
    }

    //base shape for the front porch roof
    public void porchRoofArtifact(Graphics2D g2d, Color mainColor, Color outlineColor){
        int[] xPoints = {520, 565, 575, 540};
        int[] yPoints = {431, 406, 420, 455};
        g2d.setColor(mainColor);
        g2d.fillPolygon(xPoints, yPoints, xPoints.length);
        g2d.setColor(outlineColor);
        g2d.drawPolygon(xPoints, yPoints, xPoints.length);
    }

    //draw the small roof using PorchRoofArtifact
    public void drawPorchRoof(Graphics2D g2d, Color mainColor, Color outlineColor){
        AffineTransform resetTransformations = g2d.getTransform();
        //draw the subsequent parts of the porch roof
        porchRoofArtifact(g2d, mainColor, outlineColor);
        g2d.translate(35, -25);
        porchRoofArtifact(g2d, mainColor, outlineColor);
        //porchRoofArtifact(g2d, Color.decode("#F11644"), Color.decode("#000000"));

        g2d.translate(27, -20);
        porchRoofArtifact(g2d, mainColor, outlineColor);

        g2d.scale(0.85, 0.85);
        g2d.translate(130, 50);
        porchRoofArtifact(g2d, mainColor, outlineColor);

        g2d.scale(0.9, 0.9);
        g2d.translate(90, 25);
        porchRoofArtifact(g2d, mainColor, outlineColor);
        g2d.setTransform(resetTransformations);

        //rotate and duplicate the other half of the porch
        g2d.rotate(350, 685, 327);
        porchRoofArtifact(g2d, mainColor, outlineColor);

        g2d.translate(35, -25);
        porchRoofArtifact(g2d, mainColor, outlineColor);

        g2d.translate(27, -20);
        porchRoofArtifact(g2d, mainColor, outlineColor);

        g2d.scale(0.85, 0.85);
        g2d.translate(130, 50);
        porchRoofArtifact(g2d, mainColor, outlineColor);

        g2d.scale(0.9, 0.9);
        g2d.translate(90, 25);
        porchRoofArtifact(g2d, mainColor, outlineColor);
        g2d.setTransform(resetTransformations);

        //small circle on top of porch roof
        g2d.setColor(Color.WHITE);
        g2d.fillOval(673, 318, 24, 24);

        g2d.setClip(673, 318, 24, 24);
        g2d.setColor(Color.decode("#FF0D3C"));
        g2d.fillOval(674, 321, 24, 24);
        g2d.setClip(null);

        g2d.setColor(Color.BLACK);
        g2d.drawOval(673, 318, 24, 24);

        g2d.setTransform(resetTransformations);
    }


    public void drawFrontPorch(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();

        //TODO create the shadow on top of the porch roof
        //porch shadow on roof
//        g2d.scale(1.1, 1.1);
//        g2d.translate(-15, -15);
//        drawPorchRoof(g2d, new Color(0, 0, 0, 90), new Color(0, 0, 0, 90));
//        g2d.setTransform(resetTransformations);

        //wall of front porch
        g2d.setColor(Color.WHITE);
        g2d.fillRect(570, 421, 222, 259);

        //shadow on porch wall
        g2d.setColor(new Color(0, 0, 0, 60));
        g2d.fillRect(560, 421, 250, 30);

        //pillars for porch
        Path2D.Double pillar1 = new Path2D.Double();
        Path2D.Double pillar2 = new Path2D.Double();
        //pillar1
        pillar1.moveTo(560, 438);
        pillar1.curveTo(564, 565, 564, 584, 560, 680);
        pillar1.curveTo(560, 680, 590, 680, 590, 680);
        pillar1.curveTo(585, 599, 583, 554, 590, 438);
        pillar1.curveTo(590, 438, 560, 438, 560, 438);
        g2d.setColor(Color.decode("#BEBFC1"));
        g2d.fill(pillar1);
        g2d.setColor(Color.BLACK);
        g2d.draw(pillar1);
        //pillar2
        pillar2.moveTo(777, 435);
        pillar2.curveTo(782, 544, 782, 584, 777, 680);
        pillar2.curveTo(777, 680, 803, 680, 803, 680);
        pillar2.curveTo(800, 579, 801, 555, 803, 435);
        pillar2.curveTo(803, 435, 777, 435, 777, 435);
        g2d.scale(1.17, 1);
        g2d.translate(-107, 0);
        g2d.setColor(Color.decode("#BEBFC1"));
        g2d.fill(pillar2);
        g2d.setColor(Color.BLACK);
        g2d.draw(pillar2);
        g2d.setTransform(resetTransformations);

        //porch top wall triangle
        Path2D.Double porchTop = new Path2D.Double();
        porchTop.moveTo(547, 439);
        porchTop.curveTo(547, 439, 817, 438, 817, 438);
        porchTop.curveTo(817, 438, 696, 325, 696, 325);
        porchTop.curveTo(696, 325, 547, 439, 547, 439);

        g2d.setColor(Color.decode("#DEDFE1"));
        g2d.fill(porchTop);
        g2d.setColor(Color.BLACK);
        g2d.draw(porchTop);

        //small roof for porch
        drawPorchRoof(g2d, Color.decode("#F11644"), Color.decode("#000000"));
        g2d.setTransform(resetTransformations);
    }

    public void drawPorchRoofShadow(Graphics2D g2d){

        AffineTransform resetTransformations = g2d.getTransform();

        g2d.setColor(new Color(0, 0, 0, 130));
        g2d.fillOval(652, 303, 25, 25);

        g2d.setColor(new Color(0, 0, 0, 120));

        int[] xPoints = {673, 628, 631, 602, 605, 569, 572, 542, 545, 507, 529, 675, 823, 841, 802, 806, 776, 780,
                744, 746, 718, 720};
        int[] yPoints = {324, 349, 353, 367, 371, 390, 394, 410, 415, 436, 461, 345, 461, 434, 414, 408, 391, 387,
                367, 366, 351, 349};

        g2d.translate(-8, -13);
        g2d.fillPolygon(xPoints, yPoints, xPoints.length);
        g2d.setTransform(resetTransformations);

    }

}
