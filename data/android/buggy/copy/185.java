@java.lang.Override
public boolean isCellEditable(java.lang.Object node, int column) {
    return (getColumnClass(column)) == (com.puppycrawl.tools.checkstyle.gui.TreeTableModel.class);
}