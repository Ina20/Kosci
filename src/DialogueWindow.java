import javax.swing.*;
import java.awt.*;

public class DialogueWindow {

    JFrame frame;
    JTextArea textInput

    public void createWindow(){

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 500));
        frame.pack();
        frame.setVisible(true);
    }
}
