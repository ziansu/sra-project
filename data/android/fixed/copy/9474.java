@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    synchronized(p) {
        p.onClick();
    }
}