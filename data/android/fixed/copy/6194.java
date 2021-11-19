@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    while (Pirates.pressedKeys.contains(e.getKeyCode())) {
        Pirates.pressedKeys.remove(((java.lang.Integer) (e.getKeyCode())));
    } 
}