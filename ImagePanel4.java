import javax.swing.*;
import java.awt.*;

public class ImagePanel4 extends JPanel {

    private Image image4;

    void setImage(Image image4) {
        this.image4 = image4;
        repaint();
    }

    public int random(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawImage(image, 100, 100, this);
        //g.drawImage(image2, 90, 80,this);
        g.drawImage(image4, random(0, this.getWidth() - 80), random(0, this.getHeight() - 60), null);

    }
}