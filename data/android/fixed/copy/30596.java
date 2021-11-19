@java.lang.Override
public void keyTyped(java.awt.event.KeyEvent e) {
    synchronized(lock) {
        key = e.getKeyChar();
        keyRead = false;
        lock.notify();
    }
}