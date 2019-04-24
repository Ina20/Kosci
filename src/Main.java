
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Main {

    static Image dice1, dice2, dice3, dice4, dice5;
    static boolean click = false;

    public static void main(String[] args){

        int kostka1, kostka2, kostka3, kostka4, kostka5;
        /*
        GameLogic l = new GameLogic();
        kostka1 = l.roll();
        kostka2 = l.roll();
        kostka3 = l.roll();
        kostka4 = l.roll();
        kostka5 = l.roll();
        */

        ImageIcon d1 = new ImageIcon("src/kostka1.png");
        ImageIcon d2 = new ImageIcon("src/kostka2.png");
        ImageIcon d3 = new ImageIcon("src/kostka3.png");
        ImageIcon d4 = new ImageIcon("src/kostka4.png");
        ImageIcon d5 = new ImageIcon("src/kostka5.png");
        ImageIcon d6 = new ImageIcon("src/kostka6.png");

        Board board = new Board();
        board.createBoard();


        board.imp.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (!click) {
                    click = true;
                }else{
                    click = false;
                }
            }
        });


        board.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int kostka1, kostka2, kostka3, kostka4, kostka5;

                GameLogic l = new GameLogic();

                if (!click) {
                    kostka1 = l.roll();
                    kostka2 = l.roll();
                    kostka3 = l.roll();
                    kostka4 = l.roll();
                    kostka5 = l.roll();

                    switch (kostka1) {
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
                    switch (kostka2) {
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
                    switch (kostka3) {
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
                    switch (kostka4) {
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
                    switch (kostka5) {
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

                    int tab[] = l.check( kostka1,kostka2,kostka3,kostka4,kostka5 );

                    for(int i =0; i<13; i++) {
                    System.out.println( tab[i] );
                    board.table.setValueAt(tab[i], i, 1);
                    }
                    board.imp.setImage(dice1,dice2,dice3,dice4,dice5);

                } else {
                }

            }
        });

        //imp2.setImage(dice2);
        //imp3.setImage(dice3);
        //imp4.setImage(dice4);
        //imp5.setImage(dice5);


    }
}
