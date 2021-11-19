public void actionPerformed(java.awt.event.ActionEvent evt) {
    if (checkDescent()) {
        descend();
        repaint();
    }
    timeDiff = java.lang.System.currentTimeMillis();
}