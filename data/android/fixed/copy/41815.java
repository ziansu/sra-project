private void btn_stopActionPerformed(java.awt.event.ActionEvent evt) {
    btn_stop.setVisible(false);
    btn_start.setVisible(true);
    server.stop();
}