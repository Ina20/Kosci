import javax.swing.*;
import java.awt.*;

public class ImagePanel2 extends JPanel {

    private Image image2;

    void setImage(Image image, Image image2) {
        if(Main.click3) {
            this.image2 = image2;
        }else {
            this.image2 = image;
        }
        repaint();
        repaint();
    }

    public int random(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(Main.click3) {
            g.drawImage(image2, 10, 10, this);
        }else {
            g.drawImage(image2, random(0, this.getWidth() - 70), random(0, this.getHeight() - 60), null);
        }
    }
}