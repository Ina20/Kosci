import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class Board {

    JFrame frame;
    ImagePanel imp;
    JButton button;
    JTable table;
    JPanel buttonPanel, tablePanel;

    public void createBoard(){

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = null;
        Insets insets = new Insets(0,0,0,0);

        frame = new JFrame("Kosci");
        frame.getContentPane().setLayout(layout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800,700));

        imp = new ImagePanel();
        //imp.setBackground(Color.black);
        imp.setPreferredSize(new Dimension(500, 600));
        c = new GridBagConstraints(1, 0, 1, 1, 0.6, 0.8, GridBagConstraints.PAGE_START, GridBagConstraints.BOTH, insets, 0, 450);
        frame.getContentPane().add(imp, c);

/*
        ImagePanel imp2 = new ImagePanel();
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

        button = new JButton("Roll");
        button.setPreferredSize(new Dimension(200, 50));

        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(500, 100));
        c = new GridBagConstraints(1, 1, 1, 1, 0.6, 0.2, GridBagConstraints.PAGE_END, GridBagConstraints.BOTH, insets, 0, 0);
        frame.getContentPane().add(buttonPanel, c);
        buttonPanel.add(button, new FlowLayout(FlowLayout.CENTER));

        table = new JTable(18,3);
        table.setPreferredSize(new Dimension(300, 630));
        for(int i=0; i<18; i++) {
            table.setRowHeight(i, 35);
        }

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0; i<3; i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        table.setValueAt("Player 1",0,1);
        table.setValueAt("Player 2",0,2);
        table.setValueAt("Jedynki",1,0);
        table.setValueAt("Dwójki",2,0);
        table.setValueAt("Trójki",3,0);
        table.setValueAt("Czwórki",4,0);
        table.setValueAt("Piątki",5,0);
        table.setValueAt("Szóstki",6,0);
        table.setValueAt("Premia",7,0);
        table.setValueAt("Suma",8,0);
        table.setValueAt("3 jednakowe",9,0);
        table.setValueAt("4 jednakowe",10,0);
        table.setValueAt("Ful",11,0);
        table.setValueAt("Mały strit",12,0);
        table.setValueAt("Duży strit",13,0);
        table.setValueAt("Generał",14,0);
        table.setValueAt("Szansa",15,0);
        table.setValueAt("Suma",16,0);
        table.setValueAt("Razem",17,0);


        tablePanel = new JPanel();
        tablePanel.setPreferredSize(new Dimension(300, 700));
        c = new GridBagConstraints(0, 0, 1, 2, 0.4, 1, GridBagConstraints.FIRST_LINE_START, GridBagConstraints.BOTH, insets, 0, 0);
        frame.getContentPane().add(tablePanel, c);
        tablePanel.add(table);

        frame.pack();
        frame.setVisible(true);
    }
}
