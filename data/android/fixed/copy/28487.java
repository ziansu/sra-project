public boolean loadTable(javax.swing.JFrame frame, javax.swing.table.DefaultTableModel tableModel) {
    if ((myJFileChooser.showOpenDialog(frame)) == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        return loadTable(myJFileChooser.getSelectedFile(), tableModel);
    }
    return false;
}