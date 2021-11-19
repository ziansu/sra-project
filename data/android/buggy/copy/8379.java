public int collectUserOption(java.lang.String question) {
    int response = 0;
    response = javax.swing.JOptionPane.showConfirmDialog(null, displayText, windowMessage, javax.swing.JOptionPane.PLAIN_MESSAGE, chatIcon);
    return response;
}