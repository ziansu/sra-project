private void putOnTop() {
    uploadWindow.setVisible(true);
    uploadWindow.setAlwaysOnTop(true);
    uploadWindow.toFront();
    uploadWindow.setAlwaysOnTop(false);
    uploadWindow.requestFocus();
}