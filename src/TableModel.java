import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class TableModel extends AbstractTableModel {

    String[] columnNames = {"","Player 1","Player 2"};
    Object[][] data = {{"Jedynki","",""},{"Dwójki","",""},{"Trójki","",""},{"Czwórki","",""},{"Piątki","",""},{"Szóstki","",""},{"Premia","",""},{"Suma","",""},{"3 jednakowe","",""},{"4 jednakowe","",""},{"Ful","",""},{"Mały strit","",""},{"Duży strit","",""},{"Generał","",""},{"Szansa","",""},{"Suma","",""},{"Razem","",""}};

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    public void setValueAt(Object value, int row, int col){
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }

    public boolean isCellEditable(int row, int col){
        return false;
    }

    public String getColumnName(int col){
        return columnNames[col];
    }


}
