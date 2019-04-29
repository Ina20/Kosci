import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.table.*;
import java.awt.*;


public class Board {

    JFrame frame;
    ImagePanel imp;
    ImagePanel1 imp1;
    ImagePanel2 imp2;
    ImagePanel3 imp3;
    ImagePanel4 imp4;
    JButton button;
    JTable table;
    JPanel buttonPanel, tablePanel;
    JScrollPane scrollPane;

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
        imp.setPreferredSize(new Dimension(500, 120));
        c = new GridBagConstraints(1, 0, 1, 1, 0.6, 0.8, GridBagConstraints.PAGE_START, GridBagConstraints.BOTH, insets, 0, 0);
        frame.getContentPane().add(imp, c);

        imp1 = new ImagePanel1();
        imp1.setPreferredSize(new Dimension(100, 120));
        c = new GridBagConstraints(1, 1, 1, 1, 0.6, 0.8, GridBagConstraints.PAGE_START, GridBagConstraints.BOTH, insets, 0, 0);
        frame.getContentPane().add(imp1, c);

        imp2 = new ImagePanel2();
        imp2.setPreferredSize(new Dimension(100, 120));
        c = new GridBagConstraints(1, 2, 1, 1, 0.6, 0.8, GridBagConstraints.PAGE_START, GridBagConstraints.BOTH, insets, 0, 0);
        frame.getContentPane().add(imp2, c);

        imp3 = new ImagePanel3();
        imp3.setPreferredSize(new Dimension(100, 120));
        c = new GridBagConstraints(1, 3, 1, 1, 0.6, 0.8, GridBagConstraints.PAGE_START, GridBagConstraints.BOTH, insets, 0, 0);
        frame.getContentPane().add(imp3, c);

        imp4 = new ImagePanel4();
        imp4.setPreferredSize(new Dimension(100, 120));
        c = new GridBagConstraints(1, 4, 1, 1, 0.6, 0.8, GridBagConstraints.PAGE_START, GridBagConstraints.BOTH, insets, 0, 0);
        frame.getContentPane().add(imp4, c);

        button = new JButton("Roll");
        button.setPreferredSize(new Dimension(200, 50));

        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(500, 100));
        c = new GridBagConstraints(1, 5, 1, 1, 0.6, 0.2, GridBagConstraints.PAGE_END, GridBagConstraints.BOTH, insets, 0, 0);
        frame.getContentPane().add(buttonPanel, c);
        buttonPanel.add(button, new FlowLayout(FlowLayout.CENTER));

        TableModel model = new TableModel();

        table = new JTable(model){
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {

                Component c = super.prepareRenderer(renderer, row, column);
                JComponent jc = (JComponent)c;

                for (int i=0; i<17; i++) {
                    if (row == 6 || row == 15) {
                        int top = 2;
                        int left = 0;
                        int bottom = 2;
                        int right = 0;
                        jc.setBorder(BorderFactory.createMatteBorder(top, left, bottom, right, Color.BLACK));
                    }
                    if (row == 7 || row == 16) {
                        int top2 = 0;
                        int left2 = 0;
                        int bottom2 = 2;
                        int right2 = 0;
                        jc.setBorder(BorderFactory.createMatteBorder(top2, left2, bottom2, right2, Color.BLACK));
                    }
                    if (isRowSelected(row) && row != 6 && row != 7 && row != 15 && row != 16){
                        int top2 = (row > 0 && isRowSelected(row-1))?1:2;
                        int left2 = column == 0?2:0;
                        int bottom2 = (row < getRowCount()-1 && isRowSelected(row + 1))?1:2;
                        int right2 = column == getColumnCount()-1?2:0;
                        jc.setBorder(BorderFactory.createMatteBorder(top2, left2, bottom2, right2, this.getSelectionBackground()));
                    }
                }
                return c;
            }
        };

        table.setPreferredSize(new Dimension(300, 595));
        for(int i=0; i<18; i++) {
            table.setRowHeight(i, 35);
        }
        table.setRowSelectionAllowed(false);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0; i<3; i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }


        scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(300, 617));

        tablePanel = new JPanel();
        tablePanel.setPreferredSize(new Dimension(300, 700));
        c = new GridBagConstraints(0, 0, 1, 6, 0.4, 1, GridBagConstraints.FIRST_LINE_START, GridBagConstraints.BOTH, insets, 0, 0);
        frame.getContentPane().add(tablePanel, c);
        //tablePanel.add(table);
        tablePanel.add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }
}
