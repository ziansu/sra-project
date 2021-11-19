public void mouseReleased(java.awt.event.MouseEvent e) {
    table.setFocusable(true);
    table.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    table.getTableHeader().setResizingColumn(null);
    table.getTableHeader().setDraggedColumn(null);
}