@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    this.getGame().getKeyManager().onKeyRelease(e.getKeyCode());
    this.getCurrentScreen().onKeyRelease(e);
    this.getEventHandler();
}