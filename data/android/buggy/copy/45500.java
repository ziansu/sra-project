private void cancelButtonTableCellPopupActionPerformed(java.awt.event.ActionEvent evt) {
    selectedTable.setEnabled(true);
    setProjectManagerFunction(true);
    selectedTable.getComponentAt(selectedRow, selectedColumn).requestFocus();
    windowClose();
}