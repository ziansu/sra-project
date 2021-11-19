public void mouseExited(java.awt.event.MouseEvent evt) {
    if ((evt.getSource()) instanceof javax.swing.AbstractButton) {
        java.lang.System.out.println("XMAXframe.mouseExited(evt) --> set message in statusBar");
        statusBar.setMessage("");
    }
}