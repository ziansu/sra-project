@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ae) {
    doMovement();
    checkCollisions();
    repaint();
}