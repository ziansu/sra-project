private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
    chooser.showOpenDialog(null);
    p2p.Server.new_file = chooser.getSelectedFile();
    p2p.Server.th.setFile(p2p.Server.new_file);
}