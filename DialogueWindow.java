import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DialogueWindow {

    JFrame frame;
    JPanel panel2;
    JTextArea textInput, area;
    JButton sendButton;

    public void createWindow(){

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 500));

        area = new JTextArea();
        area.setPreferredSize(new Dimension(600, 350));
        area.setBackground(Color.PINK);
        frame.add(area, BorderLayout.NORTH);

        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(600, 100));
        frame.add(panel2, BorderLayout.SOUTH);

        textInput = new JTextArea();
        textInput.setPreferredSize(new Dimension(400, 100));
        textInput.setBackground(Color.CYAN);
        panel2.add(textInput, new FlowLayout(FlowLayout.LEFT));

        sendButton = new JButton("Wyślij");
        sendButton.setPreferredSize(new Dimension(150, 80));
        panel2.add(sendButton, new FlowLayout(FlowLayout.RIGHT));



        frame.pack();
        frame.setVisible(true);
    }
}
