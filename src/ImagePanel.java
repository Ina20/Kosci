import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {

    private Image image,image1,image2,image3,image4;

    void setImage(Image image,Image image1,Image image2,Image image3,Image image4) {
        this.image = image;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
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
        //g.drawImage(image, 60, 60, this);
        //g.drawImage(image2, 90, 80,this);
        g.drawImage(image, random(0, this.getWidth() - 70), random(0, this.getHeight() - 60), null);
        g.drawImage(image1, random(0, this.getWidth() - 70), random(0, this.getHeight() - 60), null);
        g.drawImage(image2, random(0, this.getWidth() - 70), random(0, this.getHeight() - 60), null);
        g.drawImage(image3, random(0, this.getWidth() - 70), random(0, this.getHeight() - 60), null);
        g.drawImage(image4, random(0, this.getWidth() - 70), random(0, this.getHeight() - 60), null);
    }
}
