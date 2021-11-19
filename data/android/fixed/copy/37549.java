@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    panel.clearSquares();
    panel.setDraw(true);
    stop.setEnabled(false);
    pause.setEnabled(false);
    start.setEnabled(true);
    life.setRunning(false);
}