@java.lang.Override
public boolean isCellEditable(int row, int col) {
    if ((table.getModel().getValueAt(row, 0)) == "Gaussian Weight Function") {
        if (col != 0)
            return true;
        
    }
    return col == 1;
}