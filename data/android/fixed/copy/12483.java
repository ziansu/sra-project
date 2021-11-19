public void updateGUI() {
    if ((controls) != null) {
        controls.updateButtons();
    }
    repaint(0, 0, getWidth(), getHeight());
}