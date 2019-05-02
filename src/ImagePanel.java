import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {

    private Image image;

    void setImage(Image image, Image image2) {
        if(Main.click1) {
            this.image = image2;
        }else {
            this.image = image;
        }
        repaint();
    }

    public int random(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(Main.click1) {
            g.drawImage(image, 10, 10, this);
        }else {
            g.drawImage(image, random(0, this.getWidth() - 70), random(0, this.getHeight() - 60), null);
        }
    }
}
