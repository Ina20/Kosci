import javax.swing.*;
import java.awt.*;

public class ImagePanel3 extends JPanel {

    private Image image3;

    void setImage(Image image3) {
        this.image3 = image3;
        repaint();
    }

    public int random(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawImage(image3, 60, 60, this);
        //g.drawImage(image2, 90, 80,this);
        g.drawImage(image3, random(0, this.getWidth() - 80), random(0, this.getHeight() - 60), null);
    }
}