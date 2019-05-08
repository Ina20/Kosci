import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class DialogueWindow {

    JFrame frame;
    JPanel panel;
    JTextArea textInput;
    JButton sendButton;

    public void createWindow(){

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 500));

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(600, 100));
        frame.add(panel, BorderLayout.SOUTH);

        textInput = new JTextArea();
        textInput.setPreferredSize(new Dimension(400, 100));
        textInput.setBackground(Color.CYAN);
        panel.add(textInput, new FlowLayout(FlowLayout.LEFT));

        sendButton = new JButton("Wyślij");
        sendButton.setPreferredSize(new Dimension(150, 100));
        panel.add(sendButton, new FlowLayout(FlowLayout.RIGHT));



        frame.pack();
        frame.setVisible(true);
    }
}
