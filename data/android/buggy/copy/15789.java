@java.lang.Override
protected java.lang.Void doInBackground() throws java.lang.Exception {
    channel.get_artwork(dimension);
    ((javax.swing.table.DefaultTableModel) (table.getModel())).fireTableCellUpdated(row, column);
    return null;
}