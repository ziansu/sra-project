public java.lang.String collectResponse(java.lang.String question) {
    java.lang.String response = "";
    response = (javax.swing.JOptionPane.showInputDialog(null, question, windowMessage, javax.swing.JOptionPane.INFORMATION_MESSAGE, chatIcon, null, "Type here please!").toString()) + "";
    return response;
}