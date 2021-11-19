public void updateGUI() {
    java.lang.System.out.println("call to updateGUI");
    if ((controls) != null) {
        controls.updateButtons();
    }
    repaint(0, 0, getWidth(), getHeight());
}