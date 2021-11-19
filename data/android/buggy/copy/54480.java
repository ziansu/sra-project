private void jMenuItem1AncestorAdded(javax.swing.event.AncestorEvent evt) {
    if ((privilegio_usuario) == 0) {
        java.lang.System.out.println("agrega");
        this.jMenuItem1.setVisible(true);
    }else {
        java.lang.System.out.println("menu1");
    }
}