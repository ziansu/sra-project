@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent evt) {
    com.fwumdesoft.api.io.Keyboard.active = true;
    com.fwumdesoft.api.io.Keyboard.data.put(evt.getKeyCode(), false);
}