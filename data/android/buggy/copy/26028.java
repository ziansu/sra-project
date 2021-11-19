private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {
    this.setVisible(false);
    teaeli.TeaELI.loginFrame.dispose();
    teaeli.TeaELI.loginFrame = new teaeli.LoginFrame();
    teaeli.TeaELI.loginFrame.setVisible(true);
    teaeli.TeaELI.loginFrame.setSize(740, 400);
}