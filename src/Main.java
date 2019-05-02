
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Main {

    static Image dice1, dice2, dice3, dice4, dice5, zaz1, zaz2, zaz3, zaz4, zaz5;
    static ImageIcon d1, d2, d3, d4, d5, d6, z1, z2, z3, z4, z5, z6;
    static boolean click1, click2, click3, click4, click5;
    static int kostka1, kostka2, kostka3, kostka4, kostka5;

    public static void main(String[] args){

       // int kostka1, kostka2, kostka3, kostka4, kostka5;
        /*
        GameLogic l = new GameLogic();
        kostka1 = l.roll();
        kostka2 = l.roll();
        kostka3 = l.roll();
        kostka4 = l.roll();
        kostka5 = l.roll();
        */

        d1 = new ImageIcon("src/kostka1.png");
        d2 = new ImageIcon("src/kostka2.png");
        d3 = new ImageIcon("src/kostka3.png");
        d4 = new ImageIcon("src/kostka4.png");
        d5 = new ImageIcon("src/kostka5.png");
        d6 = new ImageIcon("src/kostka6.png");
        z1 = new ImageIcon("src/zaznaczenie1.png");
        z2 = new ImageIcon("src/zaznaczenie2.png");
        z3 = new ImageIcon("src/zaznaczenie3.png");
        z4 = new ImageIcon("src/zaznaczenie4.png");
        z5 = new ImageIcon("src/zaznaczenie5.png");
        z6 = new ImageIcon("src/zaznaczenie6.png");

        click1 = false;
        click2 = false;
        click3 = false;
        click4 = false;
        click5 = false;



        Board board = new Board();
        board.createBoard();

        board.imp.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (!click1) {
                    click1 = true;
                    board.imp.setImage(dice1, zaz1);
                }else{
                    click1 = false;
                    board.imp.setImage(dice1, zaz1);
                }
            }
        });
        board.imp1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (!click2) {
                    click2 = true;
                    board.imp1.setImage(dice2, zaz2);
                }else{
                    click2 = false;
                    board.imp1.setImage(dice2, zaz2);
                }
            }
        });
        board.imp2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (!click3) {
                    click3 = true;
                    board.imp2.setImage(dice3, zaz3);
                }else{
                    click3 = false;
                    board.imp2.setImage(dice3, zaz3);
                }
            }
        });
        board.imp3.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (!click4) {
                    click4 = true;
                    board.imp3.setImage(dice4, zaz4);
                }else{
                    click4 = false;
                    board.imp3.setImage(dice4, zaz4);
                }
            }
        });
        board.imp4.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if (!click5) {
                    click5 = true;
                    board.imp4.setImage(dice5, zaz5);
                }else{
                    click5 = false;
                    board.imp4.setImage(dice5, zaz5);
                }
            }
        });

        board.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                GameLogic l = new GameLogic();

                if (!click1) {
                    kostka1 = l.roll();
                    switch (kostka1) {
                        case 1:
                            dice1 = d1.getImage();
                            zaz1 = z1.getImage();
                            break;
                        case 2:
                            dice1 = d2.getImage();
                            zaz1 = z2.getImage();
                            break;
                        case 3:
                            dice1 = d3.getImage();
                            zaz1 = z3.getImage();
                            break;
                        case 4:
                            dice1 = d4.getImage();
                            zaz1 = z4.getImage();
                            break;
                        case 5:
                            dice1 = d5.getImage();
                            zaz1 = z5.getImage();
                            break;
                        case 6:
                            dice1 = d6.getImage();
                            zaz1 = z6.getImage();
                            break;
                    }
                }else{
                }

                if (!click2) {
                    kostka2 = l.roll();
                    switch (kostka2) {
                        case 1:
                            dice2 = d1.getImage();
                            zaz2 = z1.getImage();
                            break;
                        case 2:
                            dice2 = d2.getImage();
                            zaz2 = z2.getImage();
                            break;
                        case 3:
                            dice2 = d3.getImage();
                            zaz2 = z3.getImage();
                            break;
                        case 4:
                            dice2 = d4.getImage();
                            zaz2 = z4.getImage();
                            break;
                        case 5:
                            dice2 = d5.getImage();
                            zaz2 = z5.getImage();
                            break;
                        case 6:
                            dice2 = d6.getImage();
                            zaz2 = z6.getImage();
                            break;
                    }
                }else{
                }

                if (!click3) {
                    kostka3 = l.roll();
                    switch (kostka3) {
                        case 1:
                            dice3 = d1.getImage();
                            zaz3 = z1.getImage();
                            break;
                        case 2:
                            dice3 = d2.getImage();
                            zaz3 = z2.getImage();
                            break;
                        case 3:
                            dice3 = d3.getImage();
                            zaz3 = z3.getImage();
                            break;
                        case 4:
                            dice3 = d4.getImage();
                            zaz3 = z4.getImage();
                            break;
                        case 5:
                            dice3 = d5.getImage();
                            zaz3 = z5.getImage();
                            break;
                        case 6:
                            dice3 = d6.getImage();
                            zaz3 = z6.getImage();
                            break;
                    }
                }else{
                }

                if (!click4) {
                    kostka4 = l.roll();
                    switch (kostka4) {
                        case 1:
                            dice4 = d1.getImage();
                            zaz4 = z1.getImage();
                            break;
                        case 2:
                            dice4 = d2.getImage();
                            zaz4 = z2.getImage();
                            break;
                        case 3:
                            dice4 = d3.getImage();
                            zaz4 = z3.getImage();
                            break;
                        case 4:
                            dice4 = d4.getImage();
                            zaz4 = z4.getImage();
                            break;
                        case 5:
                            dice4 = d5.getImage();
                            zaz4 = z5.getImage();
                            break;
                        case 6:
                            dice4 = d6.getImage();
                            zaz4 = z6.getImage();
                            break;
                    }
                }else{
                }

                if (!click5) {
                    kostka5 = l.roll();
                    switch (kostka5) {
                        case 1:
                            dice5 = d1.getImage();
                            zaz5 = z1.getImage();
                            break;
                        case 2:
                            dice5 = d2.getImage();
                            zaz5 = z2.getImage();
                            break;
                        case 3:
                            dice5 = d3.getImage();
                            zaz5 = z3.getImage();
                            break;
                        case 4:
                            dice5 = d4.getImage();
                            zaz5 = z4.getImage();
                            break;
                        case 5:
                            dice5 = d5.getImage();
                            zaz5 = z5.getImage();
                            break;
                        case 6:
                            dice5 = d6.getImage();
                            zaz5 = z6.getImage();
                            break;
                    }
                }else{
                }

                int tab[] = l.check(kostka1, kostka2, kostka3, kostka4, kostka5);

                for (int i = 0; i < 13; i++) {
                    System.out.println(tab[i]);
                    board.table.setValueAt(tab[i], i, 1);
                }

                board.imp.setImage(dice1, zaz1);
                board.imp1.setImage(dice2, zaz2);
                board.imp2.setImage(dice3, zaz3);
                board.imp3.setImage(dice4, zaz4);
                board.imp4.setImage(dice5, zaz5);
                
            }
        });

    }
}
