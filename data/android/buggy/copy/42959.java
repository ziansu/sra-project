private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {
    renderer.reset();
    labelVert.setText(("V: " + 0));
    labelHoz.setText(("H: " + 0));
    userIgnoredTheContinueButton();
}