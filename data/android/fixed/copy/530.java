private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {
    clases.Comandos cmd = new clases.Comandos();
    javax.swing.tree.DefaultMutableTreeNode carpetaRaiz = new javax.swing.tree.DefaultMutableTreeNode(cmd.getDirectorioActual());
    javax.swing.JTree arbol = new javax.swing.JTree(carpetaRaiz);
}