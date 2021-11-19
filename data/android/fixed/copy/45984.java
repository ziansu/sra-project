public void released(int x, int y) {
    if (!(Display.impl.isScrollWheeling())) {
        state = com.codename1.ui.Button.STATE_ROLLOVER;
        fireActionEvent(x, y);
        repaint();
    }
}