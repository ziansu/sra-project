@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    opacity += 0.1F;
    if ((opacity) > 1.0F) {
        opacity = 1.0F;
        timer.stop();
    }
    repaint();
}