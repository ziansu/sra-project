public void released(int x, int y) {
    state = com.codename1.ui.Button.STATE_ROLLOVER;
    if (!(Display.impl.isScrollWheeling())) {
        fireActionEvent(x, y);
    }
    repaint();
}