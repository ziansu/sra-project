private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {
    int ret = openFile.close();
    jLabel1.setText("mp3 File Name");
    if (ret == (-1))
        javax.swing.JOptionPane.showMessageDialog(jFrame1, "No file open");
    
}