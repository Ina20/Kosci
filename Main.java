import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    static Image dice1, dice2, dice3, dice4, dice5;

    public static void main(String[] args){

        Dice kostka1 = new Dice();
        Dice kostka2 = new Dice();
        Dice kostka3 = new Dice();
        Dice kostka4 = new Dice();
        Dice kostka5 = new Dice();

        ImageIcon d1 = new ImageIcon("src/kostka1.png");
        ImageIcon d2 = new ImageIcon("src/kostka2.png");
        ImageIcon d3 = new ImageIcon("src/kostka3.png");
        ImageIcon d4 = new ImageIcon("src/kostka4.png");
        ImageIcon d5 = new ImageIcon("src/kostka5.png");
        ImageIcon d6 = new ImageIcon("src/kostka6.png");



        JFrame frame = new JFrame("Kosci");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500,500));
        frame.pack();
        frame.setVisible(true);

//      Dlaczego sie nie commitujesz? xD
        ImagePanel imp1 = new ImagePanel();
        imp1.setPreferredSize(new Dimension(200, 400));
        frame.getContentPane().add(imp1);

        /*ImagePanel1 imp2 = new ImagePanel1();
        imp2.setPreferredSize(new Dimension(100, 400));
        frame.getContentPane().add(imp2);

        ImagePanel2 imp3 = new ImagePanel2();
        imp3.setPreferredSize(new Dimension(100, 400));
        frame.getContentPane().add(imp3);

        ImagePanel3 imp4 = new ImagePanel3();
        imp4.setPreferredSize(new Dimension(100, 400));
        frame.getContentPane().add(imp4);

        ImagePanel4 imp5 = new ImagePanel4();
        imp5.setPreferredSize(new Dimension(100, 400));
        frame.getContentPane().add(imp5);
*/

        switch(kostka1.Roll()){
            case 1:
                dice1 = d1.getImage();
                break;
            case 2:
                dice1 = d2.getImage();
                break;
            case 3:
                dice1 = d3.getImage();
                break;
            case 4:
                dice1 = d4.getImage();
                break;
            case 5:
                dice1 = d5.getImage();
                break;
            case 6:
                dice1 = d6.getImage();
                break;
        }
        switch(kostka2.Roll()){
            case 1:
                dice2 = d1.getImage();
                break;
            case 2:
                dice2 = d2.getImage();
                break;
            case 3:
                dice2 = d3.getImage();
                break;
            case 4:
                dice2 = d4.getImage();
                break;
            case 5:
                dice2 = d5.getImage();
                break;
            case 6:
                dice2 = d6.getImage();
                break;
        }
        switch(kostka3.Roll()){
            case 1:
                dice3 = d1.getImage();
                break;
            case 2:
                dice3 = d2.getImage();
                break;
            case 3:
                dice3 = d3.getImage();
                break;
            case 4:
                dice3 = d4.getImage();
                break;
            case 5:
                dice3 = d5.getImage();
                break;
            case 6:
                dice3 = d6.getImage();
                break;
        }
        switch(kostka4.Roll()){
            case 1:
                dice4 = d1.getImage();
                break;
            case 2:
                dice4 = d2.getImage();
                break;
            case 3:
                dice4 = d3.getImage();
                break;
            case 4:
                dice4 = d4.getImage();
                break;
            case 5:
                dice4 = d5.getImage();
                break;
            case 6:
                dice4 = d6.getImage();
                break;
        }
        switch(kostka5.Roll()){
            case 1:
                dice5 = d1.getImage();
                break;
            case 2:
                dice5 = d2.getImage();
                break;
            case 3:
                dice5 = d3.getImage();
                break;
            case 4:
                dice5 = d4.getImage();
                break;
            case 5:
                dice5 = d5.getImage();
                break;
            case 6:
                dice5 = d6.getImage();
                break;
        }

        imp1.setImage(dice1,dice2,dice3,dice4,dice5);
        //imp2.setImage(dice2);
        //imp3.setImage(dice3);
        //imp4.setImage(dice4);
        //imp5.setImage(dice5);
    }
}