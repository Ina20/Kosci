import javax.swing.*;
import java.awt.*;

public class ImagePanel6 extends JPanel {

    ImageIcon button_bg;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        button_bg = new ImageIcon("src/button_bg.png");
        g.drawImage(button_bg.getImage(), 0, 0, null);
    }
}