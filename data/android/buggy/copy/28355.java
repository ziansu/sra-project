public void actionPerformed(java.awt.event.ActionEvent e) {
    atbashInputBox.setText(atbash.getEncryptedWord());
    atbash.encrypt(atbash.getEncryptedWord());
    atbashOutputBox.setText(atbash.getEncryptedWord());
}