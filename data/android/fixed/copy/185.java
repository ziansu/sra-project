@java.lang.Override
public boolean isCellEditable(int column) {
    return (getColumnClass(column)) == (com.puppycrawl.tools.checkstyle.gui.TreeTableModel.class);
}