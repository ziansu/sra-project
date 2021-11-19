@java.lang.Override
public void toggleMenuState() {
    if (isRunning) {
        draw();
        menuPanel.setVisible(true);
        menuPanel.requestFocus();
        menuPanel.repaint();
    }
}