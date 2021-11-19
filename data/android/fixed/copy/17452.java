private void sendButtonActionPerformed(java.awt.event.ActionEvent e) {
    if ((email) != null) {
        email.sendMail(sendToTextField.getText(), subjectTextField.getText(), summaryEditorPane.getText());
    }
}