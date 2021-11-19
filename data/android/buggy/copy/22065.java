@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    keys[e.getKeyCode()] = false;
    com.redmintie.steelplate.input.event.KeyEvent event = createEvent(e);
    for (com.redmintie.steelplate.input.event.KeyListener listener : listeners) {
        listener.keyReleased(event);
    }
}