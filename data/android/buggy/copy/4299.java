@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    inGame();
    updateAliens();
    checkCollisions();
    repaint();
}