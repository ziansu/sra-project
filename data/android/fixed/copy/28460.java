public void actionPerformed(java.awt.event.ActionEvent evt) {
    if (checkDescent()) {
        descend();
    }
    timeDiff = java.lang.System.currentTimeMillis();
}