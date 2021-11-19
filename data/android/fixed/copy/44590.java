@java.lang.Override
public void mouseEntered(java.awt.event.MouseEvent e) {
    if (e.getSource().equals(jPanel1)) {
        isMouseInGame = true;
        this.repaint();
    }
}