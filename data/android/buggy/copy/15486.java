public void sendMessage(java.lang.String message) {
    java.lang.System.out.println(javax.swing.SwingUtilities.isEventDispatchThread());
    this.writer.println(message);
    this.writer.flush();
    this.textField.setText("");
}