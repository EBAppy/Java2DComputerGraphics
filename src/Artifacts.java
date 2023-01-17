import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Artifacts extends JComponent{
    Cloud cloud = new Cloud();
    Mountain mountain = new Mountain();
    Tree tree = new Tree();
    ForeGround foreGround = new ForeGround();
    House house = new House();
    Fence fence = new Fence();

    //override the paint method to draw objects
    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform resetTransformations = g2d.getTransform();

        //METHOD CALLS TO PAINT OBJECTS
        //apply anatialiasing to smoothen drawing
        antialiasing(g2d);

        //draw tree 1
        g2d.scale(0.45, 0.45);
        g2d.translate(1330, 580);
        tree.trees(g2d);
        g2d.translate(300, 45);
        tree.trees(g2d);
        g2d.setTransform(resetTransformations);

        //draw mountains
        mountainArtefacts(g2d);

        //draw clouds
        cloudArtefacts(g2d);

        //draw tree 3
        tree.trees(g2d);
        tree.squirrelHole(g2d);

        //draw Christmas tree
        drawChristmasTrees(g2d);

        //house
        //house 3 has the flowers and fence wall
        drawHouse(g2d);



        //@TODO Re-enable foreground
        //draw the foreground (must be the last artefact on layer)
        setForeGround(g2d);
    }


    //draw mountain artefacts
    public void mountainArtefacts(Graphics2D g2d){
        //get the original transformations of the translation and scale
        AffineTransform resetTransform = g2d.getTransform();

        g2d.translate(0, -50);
        mountain.drawMountain1(g2d);
        g2d.setTransform(resetTransform);

        //draw mountain4
        g2d.translate(300, 150);
        g2d.scale(1.05, 0.7);
        mountain.drawMountain2(g2d);
        g2d.setTransform(resetTransform);

        //draw mountain5 (yellow highland near the trees)
        mountain.drawMountainGround(g2d);
        g2d.setTransform(resetTransform);

        //draw mountain2
        g2d.translate(-90, 300);
        g2d.scale(0.9, 0.7);
        mountain.drawMountain2(g2d);
        g2d.setTransform(resetTransform);

        //draw mountain3 and shade
        g2d.translate(-130, 350);
        g2d.scale(0.9, 0.7);
        mountain.drawMountain3(g2d);
        g2d.setTransform(resetTransform);
    }


    //draw cloud artefacts
    public void cloudArtefacts(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        //get the original transformations of the translation and scale
        AffineTransform resetTransformations = g2d.getTransform();

        //draw cloud 1
        g2d.translate(-30, 50);
        g2d.scale(0.32, 0.29);
        cloud.drawCloud(g2d);

        //draw cloud2 and cloud3
        g2d.setTransform(resetTransformations);
        g2d.translate(380, -3);
        g2d.scale(0.28, 0.28);
        cloud.drawCloud(g2d);

        g2d.setTransform(resetTransformations);
        g2d.translate(374, 22);
        g2d.scale(0.20, 0.20);
        cloud.drawCloud(g2d);

        //draw cloud4
        g2d.setTransform(resetTransformations);
        g2d.translate(535, 143);
        g2d.scale(0.32, 0.32);
        cloud.drawCloud(g2d);
        g2d.setTransform(resetTransformations);

        //draw cloud5
        g2d.setTransform(resetTransformations);
        g2d.translate(1040, 7);
        g2d.scale(0.37, 0.37);
        cloud.drawCloud(g2d);
        g2d.setTransform(resetTransformations);
    }

    //draw the foreground artefacts
    public void setForeGround(Graphics2D g2d){
        //foreground
        g2d.setStroke(new BasicStroke(4f));
        foreGround.foreGround(g2d);
    }


    //draw Chritmas trees
    public void drawChristmasTrees(Graphics2D g2d){
        AffineTransform resetTransformations = g2d.getTransform();

        //biggest Christmas tree2
        g2d.translate(675, 120);
        g2d.scale(1.24, 1.58);
        tree.drawChristmasTree(g2d, "#006317", "#009D4B");
        g2d.setTransform(resetTransformations);

        //draw Christmas trees
        //tree1
        g2d.translate(894, 214);
        g2d.scale(0.85, 1.28);
        tree.drawChristmasTree(g2d, "#006317", "#009D4B");
        g2d.setTransform(resetTransformations);

        //draw yellow Christmas tree
        g2d.translate(808, 320);
        g2d.scale(0.92, 0.93);
        tree.drawChristmasTree(g2d, "#AEBE05", "#D2DC25");
        g2d.setTransform(resetTransformations);
    }

    public void drawHouse(Graphics2D g2d){
        house.drawAllHouses(g2d);
    }


    //Apply antialiasing
    public void antialiasing(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }


}
