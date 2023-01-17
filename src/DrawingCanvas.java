import javax.swing.*;
import java.awt.*;

public class DrawingCanvas extends JFrame{
    public int width = 1500;
    public int height = 818;
    Artifacts jFrameSize = new Artifacts();
    public DrawingCanvas(){
        this.pack();
        this.setSize(width, height);
        this.getContentPane().setBackground(Color.decode("#A0E2F0"));
        this.setTitle("Computer Graphics Final Project Work");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


}
