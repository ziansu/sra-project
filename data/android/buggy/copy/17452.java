private void sendButtonActionPerformed(java.awt.event.ActionEvent e) {
    email.sendMail(sendToTextField.getText(), subjectTextField.getText(), summaryEditorPane.getText());
}