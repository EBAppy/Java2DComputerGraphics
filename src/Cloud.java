import java.awt.*;
import java.awt.geom.*;

public class Cloud {

    //method to draw the clouds
    public void drawCloud(Graphics2D g2d){
        //g2d.setColor(Color.decode("#30BBEE"));
        Path2D.Double cloudOutline = new Path2D.Double();
        Path2D.Double cloudShadow = new Path2D.Double();

        double[] cloudXY = {282, 288, 278, 170, 289, 148, 395, 120, 470, 150, 512, 179, 407, 273};
        double[][] cloudbz = {{135, 325}, {130, 165}, {270, 163}, {280, 145}, {275, 87}, {368, 53}, {428, 98}, {467,
                112}, {492, 148}, {510, 157}, {617, 153}, {596, 350}, {371, 323}, {320, 323}};
        cloudOutline.moveTo(cloudXY[0], cloudXY[1]);
        cloudOutline.curveTo(cloudbz[0][0], cloudbz[0][1], cloudbz[1][0], cloudbz[1][1], cloudXY[2], cloudXY[3]);
        cloudOutline.curveTo(cloudbz[2][0], cloudbz[2][1], cloudbz[3][0], cloudbz[3][1], cloudXY[4], cloudXY[5]);
        cloudOutline.curveTo(cloudbz[4][0], cloudbz[4][1], cloudbz[5][0], cloudbz[5][1], cloudXY[6], cloudXY[7]);
        cloudOutline.curveTo(cloudbz[6][0], cloudbz[6][1], cloudbz[7][0], cloudbz[7][1], cloudXY[8], cloudXY[9]);
        cloudOutline.curveTo(cloudbz[8][0], cloudbz[8][1], cloudbz[9][0], cloudbz[9][1], cloudXY[10], cloudXY[11]);
        cloudOutline.curveTo(cloudbz[10][0], cloudbz[10][1], cloudbz[11][0], cloudbz[11][1], cloudXY[12], cloudXY[13]);
        cloudOutline.curveTo(cloudbz[12][0], cloudbz[12][1], cloudbz[13][0], cloudbz[13][1], cloudXY[0], cloudXY[1]);


        //draw inner shade
        cloudShadow.moveTo(250, 210);
        cloudShadow.curveTo(290, 310, 380, 290, 430, 220);
        cloudShadow.curveTo(432, 238, 430, 250, 417, 258);
        cloudShadow.curveTo(439, 274, 540, 310, 558, 190);
        cloudShadow.curveTo(610, 250, 510, 329, 407, 273);
        cloudShadow.curveTo(371, 320, 320, 323, 282, 288);
        cloudShadow.curveTo(250, 305, 142, 284, 180, 210);
        cloudShadow.curveTo(181, 255, 218, 278, 257, 269);
        cloudShadow.curveTo(240, 270, 233, 229, 250, 210);


        //draw the shape of the cloud
        g2d.setColor(Color.WHITE);
        g2d.fill(cloudOutline);

        g2d.setColor(Color.decode("#EDEDED"));
        g2d.fill(cloudShadow);

        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.BLACK);
        g2d.draw(cloudOutline);
    }
}