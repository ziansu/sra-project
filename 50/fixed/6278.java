public void mouseReleased(java.awt.event.MouseEvent e) {
    if ((e.getClickCount()) == 2) {
        setMaximized(frame, (!(isMaximized(frame))));
    }
}