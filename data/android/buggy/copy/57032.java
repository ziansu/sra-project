public void blockGUI() {
    getMainWindow().setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
    view.showWait();
}