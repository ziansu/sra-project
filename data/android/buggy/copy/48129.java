private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {
    if ((evt.getKeyCode()) == (java.awt.event.KeyEvent.VK_ENTER)) {
        java.lang.System.out.println(2);
        jTextField1.requestFocus();
        jTextField1.selectAll();
        this.jButton1ActionPerformed(null);
    }
}