private void jMenuItem1AncestorAdded(javax.swing.event.AncestorEvent evt) {
    if ((privilegio_usuario) != 0) {
        this.jMenuItem1.setVisible(false);
    }else {
        this.jMenuItem1.setVisible(true);
    }
}