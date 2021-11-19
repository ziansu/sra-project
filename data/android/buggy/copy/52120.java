public void changeEditPermissions(boolean allowed) {
    db.window.DataWindow.addEntry.setVisible(allowed);
    frame.repaint();
}