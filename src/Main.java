import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.stream.*;


public class Main {

    static Image dice1, dice2, dice3, dice4, dice5, zaz1, zaz2, zaz3, zaz4, zaz5;
    static ImageIcon d1, d2, d3, d4, d5, d6, z1, z2, z3, z4, z5, z6;
    static boolean click1 = false, click2 = false, click3 = false, click4 = false, click5 = false;
    static int kostka1, kostka2, kostka3, kostka4, kostka5;
    static int player = 0;
    static boolean turn = false;
    static PrintWriter pr;
    static int rolls = 3;
    static int selected[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};


    public static void main(String[] args){
        ServerSocket ss = null;
        Socket s = null;

        try {
            if (player == 0) {
                ss = new ServerSocket( 4999 );
                s = ss.accept();
            } else {
                s = new Socket("localhost",4999);
            }

            pr = new PrintWriter( s.getOutputStream());

        } catch (IOException e1) {
            e1.printStackTrace();
        }

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

        if (player == 0) {
            turn = true;
        }

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

        if (turn ) {
            if (rolls > 0) {
                board.button.addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        rolls -= 1;
                        GameLogic l = new GameLogic();

                        if (!click1) {
                            kostka1 = l.roll();
                            dice1 = getDice( kostka1 );
                            zaz1 = getZaz( kostka1 );
                        } else {
                        }
                        if (!click2) {
                            kostka2 = l.roll();
                            dice2 = getDice( kostka2 );
                            zaz2 = getZaz( kostka2 );
                        } else {
                        }

                        if (!click3) {
                            kostka3 = l.roll();
                            dice3 = getDice( kostka3 );
                            zaz3 = getZaz( kostka3 );
                        } else {
                        }

                        if (!click4) {
                            kostka4 = l.roll();
                            dice4 = getDice( kostka4 );
                            zaz4 = getZaz( kostka4 );
                        } else {
                        }

                        if (!click5) {
                            kostka5 = l.roll();
                            dice5 = getDice( kostka5 );
                            zaz5 = getZaz( kostka5 );
                        } else {
                        }

                        int tab[] = l.check( kostka1, kostka2, kostka3, kostka4, kostka5 );

                        for (int i = 0; i < 15; i++) {
                            if(board.table.isRowSelected(i) == false && selected[i] == 0) {
                                board.table.setValueAt(tab[i], i, 1);
                            }else{
                                selected[i] = 1;
                                // Zmiana gracza
                            }
                        }

                        board.imp.setImage( dice1, zaz1 );
                        board.imp1.setImage( dice2, zaz2 );
                        board.imp2.setImage( dice3, zaz3 );
                        board.imp3.setImage( dice4, zaz4 );
                        board.imp4.setImage( dice5, zaz5 );

                        pr.println( kostka1 + "," + kostka2 + "," + kostka3 + "," + kostka4 + "," + kostka5 );
                        pr.flush();
                    }

                } );
            }
        }else {
            GameLogic l = new GameLogic();
            InputStreamReader in = null;
            BufferedReader bf = null;
            String str;
            int[] kostki;
            try {
                in = new InputStreamReader( s.getInputStream());
                bf = new BufferedReader(in);
                while (!turn) {
                    System.out.println("In try");
                    str = bf.readLine();
                    System.out.println( "server: " + str );
                    kostki = parseSocketMsg(str);
                    dice1 = getDice(kostki[0]);
                    dice2 = getDice(kostki[1]);
                    dice3 = getDice(kostki[2]);
                    dice4 = getDice(kostki[3]);
                    dice5 = getDice(kostki[4]);

                    board.imp.setImage( dice1, zaz1 );
                    board.imp1.setImage( dice2, zaz2 );
                    board.imp2.setImage( dice3, zaz3 );
                    board.imp3.setImage( dice4, zaz4 );
                    board.imp4.setImage( dice5, zaz5 );

                    int tab[] = l.check(kostki[0], kostki[1], kostki[2], kostki[3], kostki[4]);
                    for (int i = 0; i < 15; i++) {
                        board.table.setValueAt( tab[i], i, 1 );
                    }

                    System.out.println(kostki);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static Image getZaz(int kostka) {
        Image zaz;
        switch (kostka) {
            case 1:
                zaz = z1.getImage();
                break;
            case 2:
                zaz = z2.getImage();
                break;
            case 3:
                zaz = z3.getImage();
                break;
            case 4:
                zaz = z4.getImage();
                break;
            case 5:
                zaz = z5.getImage();
                break;
            case 6:
                zaz = z6.getImage();
                break;
            default:
                zaz = null;
        }
        return zaz;
    }

    private static Image getDice(int kostka) {
        Image dice;
        switch (kostka) {
            case 1:
                dice = d1.getImage();
                break;
            case 2:
                dice = d2.getImage();
                break;
            case 3:
                dice = d3.getImage();
                break;
            case 4:
                dice = d4.getImage();

                break;
            case 5:
                dice = d5.getImage();

                break;
            case 6:
                dice = d6.getImage();
                break;
            default:
                dice = null;
        }
        return dice;
    }

    private static int[] parseSocketMsg(String str) {
        String[] msg = str.split(",");
        int [] intArr = Stream.of(msg)
                .mapToInt(nb -> Integer.parseInt(nb))
                .toArray();

        System.out.println(intArr);
        if (intArr.length == 5)
            return intArr;
        return  null;
    }

}
